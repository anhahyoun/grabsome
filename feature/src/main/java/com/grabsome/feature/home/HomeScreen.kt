@file:OptIn(ExperimentalFoundationApi::class)

package com.grabsome.feature.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.grabsome.core.data.model.home.HomeCardModel
import com.grabsome.feature.home.filter.HomeFilterFullDialog
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.absoluteValue

@Composable
fun HomeRoute(
    onSearchClick: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val selectedTab by viewModel.selectedHomeTab.collectAsState()
    val cardList by viewModel.homeCardList.collectAsState()
    HomeScreen(
        selectedType = { selectedTab },
        cardList = cardList,
        uiEvent = { event ->
            when (event) {
                is HomeUiEvent.SearchClick -> {
                    onSearchClick()
                }

                else -> {
                    viewModel.sendUiEvent(event)
                }
            }
        },
    )
}

@Composable
internal fun HomeScreen(
    selectedType: () -> HomeTabType,
    cardList: List<HomeCardModel>,
    uiEvent: (HomeUiEvent) -> Unit
) {
    val openAlertDialog = remember { mutableStateOf(false) }
    when {
        openAlertDialog.value -> {
            HomeFilterFullDialog(
                onDismissRequest = { openAlertDialog.value = false },
            )
        }
    }
    Column(modifier = Modifier.fillMaxSize()) {
        EnterAlwaysScrollBehaviorExample()
//        HomeAppBar(selectedTabType = selectedType, uiEvent)
//        HomeFilterBar {
//            when (it) {
//                is HomeUiEvent.FilterClick -> {
//                    openAlertDialog.value = true
//                }
//
//                else -> {}
//            }
//            uiEvent(it)
//        } // TODO 선택된 필터가 없다면 스크롤 시 gone 처리
//        LazyColumn {
//            items(cardList) {
//
////                KeyVisual(model = it)
//                KeyVisual2(model = it)
//                HorizontalDivider(
//                    modifier = Modifier.padding(vertical = 8.dp),
//                    thickness = 1.dp,
//                    color = color.neutral300
//                )
//            }
//        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnterAlwaysScrollBehaviorExample() {
    val nestedScrollConnection = rememberNestedScrollInteropConnection()
    val state = rememberScrollState()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    val coroutineScope = rememberCoroutineScope()
    val leftListState = rememberLazyListState()
    val rightListState = rememberLazyListState()
    var selectedIndex by remember { mutableStateOf(0) }
    var parentHeight by remember { mutableStateOf(0) }
    var lastItemHeightPx by remember { mutableStateOf(0) }

    // 부모 리스트 데이터
    val parentList = (1..20).toList()
    // 2차원 배열 데이터
    val childList = parentList.map { parent ->
        (1..6).map { child -> "Right Item $parent sub$child" }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
//        Column(
//            modifier = Modifier
//                .verticalScroll(state)
//                .nestedScroll(nestedScrollConnection)
//        ) {
//            TopAppBar(
//                title = { Text("Enter Always Scroll Behavior") },
//                scrollBehavior = scrollBehavior,
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color.Blue
//                )
//            )

        item {
            Text(
                text = "타이틀입니다.",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)
                    .padding(16.dp)
            )
        }

        item {
            Text(
                text = "퀵메뉴입니다",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Yellow)
                    .padding(16.dp)
            )
        }

//            TopAppBar(
//                title = { Text("Enter Always Scroll Behavior") },
//                scrollBehavior = scrollBehavior,
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color.Red
//                )
//            )
//    }
        item {

            Row(
                modifier = Modifier
//                .padding(innerPadding)
                    .fillMaxSize()

            ) {
                // 왼쪽 LazyColumn
                Column(
//                state = leftListState,
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(state)

                ) {
                    parentList.forEach { parentItem ->
                        ListItem(
                            headlineContent = {
                                Text(
                                    "Left Item $parentItem",
                                    color = if (selectedIndex == parentItem - 1) Color.Red else Color.Black
                                )
                            },
                            modifier = Modifier.clickable {
                                selectedIndex = parentItem - 1
                                coroutineScope.launch {
                                    rightListState.scrollToItem(selectedIndex)
                                }
                            }
                        )
                        Divider()
                    }
                }

                // 오른쪽 LazyColumn, nestedScroll 연결
//        LazyColumn(
//            state = rightListState,
//            modifier = Modifier
//                .weight(1f)
//                .nestedScroll(nestedScrollConnection)
//                .onGloballyPositioned { coordinates ->
//                    parentHeight = coordinates.size.height
//                }
//        ) {
                this@LazyColumn.items(parentList) { parentIndex ->
                    ListItem(
                        headlineContent = {
                            Text("Right Item $parentIndex main")
                            childList[parentIndex - 1].forEach { childItem ->
                                Text(childItem)
                            }
                        },
                        modifier = Modifier.onGloballyPositioned { coordinates ->
                            lastItemHeightPx = coordinates.size.height
                        }
                    )
                    Divider()
                    // 마지막 부모 항목인 경우 추가 패딩 적용
                    if (parentIndex == parentList.size) {
                        Spacer(modifier = Modifier.height(parentHeight.toDp() - lastItemHeightPx.toDp()))
                    }
                }
//        }

            }
        }
    }

// // 오른쪽 리스트의 스크롤 상태를 모니터링하고 선택 상태를 업데이트
//    LaunchedEffect(rightListState) {
//        snapshotFlow { rightListState.firstVisibleItemIndex  }
//            .collect { index ->
//                selectedIndex = index
//                coroutineScope.launch {
//                    // 현재 보이는 항목의 범위를 계산
//                    val viewportSize = leftListState.layoutInfo.visibleItemsInfo.size
//                    val middleIndex = viewportSize / 2
//                    leftListState.scrollToItem((index - middleIndex).coerceAtLeast(0))
//                }
//            }
//    }

}

// Extension function to convert pixels to DP
@Composable
fun Int.toDp(): Dp {
    val density = LocalDensity.current
    return with(density) { this@toDp.toDp() }
}

@Composable
fun KeyVisual(model: HomeCardModel) {
//    Log.e("흐흐", "KeyVisual")
    val pageCount = model.imageUrlList.size * 1000
    val pagerState =
        rememberPagerState(initialPage = pageCount / 2, pageCount = { pageCount })

    // 지정한 시간마다 auto scroll.
    // 유저의 스크롤해서 페이지가 바뀐경우 다시 실행시키고 싶기 때문에 key는 currentPage.
    LaunchedEffect(key1 = pagerState.currentPage) {
        while (true) {
            delay(5000)
            // 페이지 바뀌었다고 애니메이션이 멈추면 어색하니 NonCancellable
            withContext(NonCancellable) {
                pagerState.animateScrollToPage(pagerState.currentPage + 1)
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
    ) {
        HorizontalPager(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color.Black),
            state = pagerState,
        ) {
            val index = it % model.imageUrlList.size.coerceAtLeast(1)
            val url = model.imageUrlList.getOrNull(index)

            AsyncImage(
                modifier = Modifier
                    .fillMaxSize(),
                model = url,
                contentDescription = "컨텐츠 이미지"
            )
        }
    }
}

@Composable
fun KeyVisual2(model: HomeCardModel) {
    val pageCount = model.imageUrlList.size * 1000
    val pagerState =
        rememberPagerState(initialPage = pageCount / 2, pageCount = { pageCount })
    val threePagesPerViewport = object : PageSize {
        override fun Density.calculateMainAxisPageSize(
            availableSpace: Int,
            pageSpacing: Int
        ): Int {
            return (availableSpace - 2 * pageSpacing) / 3
        }
    }


    val isLarge = LocalConfiguration.current.screenWidthDp > 500


    Box(modifier = Modifier) {
        if (isLarge) {
            val position = pagerState.currentPage % model.imageUrlList.size.coerceAtLeast(1)
            val list = model.imageUrlList.subList(
                (position - 1).coerceAtLeast(0),
                (position + 1).coerceAtMost(model.imageUrlList.lastIndex)
            )
            SpreadCard(cardList = list)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
        ) {
            //HorizontalPager(
            //            modifier = Modifier
            //                .fillMaxWidth()
            //                .padding(16.dp)
            //                .clip(RoundedCornerShape(8.dp))
            //                .background(Color.Black),
            //            state = pagerState,
            //        ) {
            HorizontalPager(
                modifier = Modifier
                    .fillMaxSize()
                    .then(
                        if (isLarge) {
                            Modifier
                        } else {
                            Modifier
                                .padding(16.dp)
//                            .clip(RoundedCornerShape(8.dp))
                        }
                    ),
                state = pagerState,
                pageSize = if (isLarge) threePagesPerViewport else PageSize.Fill,
                pageSpacing = if (isLarge) 16.dp else 0.dp,
                contentPadding = PaddingValues(horizontal = if (isLarge) 16.dp else 0.dp),
            ) {
                val index = it % model.imageUrlList.size.coerceAtLeast(1)
                val url = model.imageUrlList.getOrNull(index)

                AsyncImage(
                    modifier = Modifier
                        .aspectRatio(1f)
                        .clip(RoundedCornerShape(8.dp))
                        .graphicsLayer {
                            // Calculate the absolute offset for the current page from the
                            // scroll position. We use the absolute value which allows us to mirror
                            // any effects for both directions
                            if (isLarge) {
                                val pageOffset =
                                    ((pagerState.currentPage - it) + pagerState.currentPageOffsetFraction)
//                            alpha = lerp(
//                                start = 0.2f,
//                                stop = 1f,
//                                fraction = 1f - pageOffset.absoluteValue.coerceIn(0f, 1f),
//                            )

//                        Log.e(
//                            "흐흐",
//                            "currentPage: ${pagerState.currentPage}, pageOffset $pageOffset"
//                        )


                                alpha = lerp(
                                    start = 0.4f,
                                    stop = 1f,
                                    fraction = 1f - pageOffset.absoluteValue.coerceIn(0f, 1f),
                                )

                                lerp(
                                    start = 0.5f,
                                    stop = 1f,
                                    fraction = 1f - pageOffset.absoluteValue.coerceIn(0f, 1f),
                                ).also { scale ->
                                    scaleX = scale
                                    scaleY = scale
                                }
                            }
                        }
                        .fillMaxSize(),
                    model = url,
                    contentDescription = "컨텐츠 이미지",
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Composable
fun SpreadCard(cardList: List<String>) {

}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    val model = HomeCardModel(
        address = "판교동",
        nickname = "최진국",
        job = "삼성",
        placeName = "식당 상호명",
        date = "3/15(금) 오후 7:30",
        body = "내용입니다.",
        imageUrlList = listOf(),
        commentCount = 0,
        wishCount = 7,
        viewCount = 10,
        isManager = false,
        category = "음식점",
        state = "모집중"
    )
    val cardList = List(10) {
        model
    }
    HomeScreen(
        selectedType = { HomeTabType.RECENT },
        cardList = cardList,
        uiEvent = {}
    )
}
