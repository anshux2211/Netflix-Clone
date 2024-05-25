package com.example.netflixclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netflixclone.ui.theme.NetflixCloneTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                modifier = Modifier.verticalScroll(rememberScrollState())
            ){
                TopAppSection()
                NetflixContentChooser()
                home_content()
                watch_again()
                Action()
                New_releases()
                Netflix_Originals()
                Comedies()
                Trending_now()
                Top_rated()
                Drama()
            }

        }
    }
}


@Composable
@Preview
fun TopAppSection(){
    Row(
    modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Image(painter = painterResource(id = R.drawable.netflix_icon), contentDescription = "netflix_logo",
            modifier = Modifier
                .size(60.dp)
                .padding(5.dp)
            )
        Row (

        ){
            Image(painter = painterResource(id = R.drawable.search_icon), contentDescription = "search_icon",
                modifier = Modifier
                    .padding(5.dp)
                    .size(50.dp)
                )
            Image(painter = painterResource(id = R.drawable.profile_icon), contentDescription = "profile_icon",
                modifier = Modifier
                    .size(55.dp)
                    .padding(5.dp)

                )
        }
    }
}

@Composable
@Preview
fun NetflixContentChooser(){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround ,

            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .padding(top = 6.dp, bottom = 6.dp)

    ){
        Text(text = "TV Shows",
            color= Color.LightGray,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 5.dp)
            )
        Text(text = "Movies",
            color= Color.LightGray,
            fontSize = 15.sp
        )
        Row {
            Text(text = "Categories",
                color= Color.LightGray,
                fontSize = 15.sp,
                modifier = Modifier.padding(end = 5.dp)
            )
            Image(painter = painterResource(id = R.drawable.drop_icon), contentDescription = "Drop_Icon")
        }


    }
}

@Composable
@Preview
fun home_content() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .height(510.dp)
            ,


        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(
            painter = painterResource(id = R.drawable.oppenheimer),
            contentDescription = "oppenheimer",
            modifier = Modifier.size(width = 185.dp, height = 370.dp)

        )


            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center ,
            ) {
                Text(
                    text = "Biography",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(3.dp)
                )
                Text(
                    text = "•",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(3.dp)
                )
                Text(
                    text = "Thrill",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(3.dp)
                )
                Text(
                    text = "•",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(3.dp)
                )
                Text(
                    text = "Drama",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(3.dp)
                )
                Text(
                    text = "•",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(3.dp)
                )
                Text(
                    text = "Teen",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(3.dp)
                )
            }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(30.dp)
                    .padding(start = 40.dp)


            ) {
                Image(painter = painterResource(id = R.drawable.plus_icon), contentDescription = "plus",
                    modifier = Modifier.size(width = 30.dp, height = 30.dp)
                    )
                Text(text = "My List",
                    color = Color.LightGray,
                    fontSize = 13.sp
                )
            }

           Button(onClick = {},
               colors = ButtonDefaults.buttonColors(Color.White),
               shape = RoundedCornerShape(4.dp)
               ) {
               Text(text = "Play",
                   color= Color.Black,
                   fontWeight = FontWeight.Bold,
                   fontSize = 18.sp
                   )

           }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(30.dp)
                    .padding(end = 40.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.info_icon), contentDescription = "plus",
                    modifier = Modifier.size(width = 30.dp, height = 30.dp)
                    )
                Text(text = "info",
                    color = Color.LightGray,
                    fontSize = 13.sp
                )
            }
        }
    }
}



@Composable
@Preview
fun watch_again(
){

    val list_of_movies= mutableListOf<Int>()
    list_of_movies.add(R.drawable.joker)
    list_of_movies.add(R.drawable.star_war)
    list_of_movies.add(R.drawable.animal)
    list_of_movies.add(R.drawable.intersteller)
    list_of_movies.add(R.drawable.boy)
    list_of_movies.add(R.drawable.black_panther)


    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxWidth()
    ) {
        Text(text = "Watch Again",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
        LazyRow(){
            itemsIndexed(list_of_movies){
                index,item->
                movie_preview(img_id = item)
            }
        }

    }
}

@Composable
@Preview
fun Action(
){

    val list_of_movies= mutableListOf<Int>()
    list_of_movies.add(R.drawable.movie1)
    list_of_movies.add(R.drawable.movie2)
    list_of_movies.add(R.drawable.movie3)
    list_of_movies.add(R.drawable.movie5)
    list_of_movies.add(R.drawable.movie6)
    list_of_movies.add(R.drawable.movie7)


    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxWidth()
    ) {
        Text(text = "Action",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
        LazyRow(){
            itemsIndexed(list_of_movies){
                    index,item->
                movie_preview(img_id = item)
            }
        }

    }
}
@Composable
@Preview
fun New_releases(
){

    val list_of_movies= mutableListOf<Int>()
    list_of_movies.add(R.drawable.movie9)
    list_of_movies.add(R.drawable.movie10)
    list_of_movies.add(R.drawable.movie11)
    list_of_movies.add(R.drawable.movie12)
    list_of_movies.add(R.drawable.movie13)
    list_of_movies.add(R.drawable.movie14)


    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxWidth()
    ) {
        Text(text = "New Releases",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
        LazyRow(){
            itemsIndexed(list_of_movies){
                    index,item->
                movie_preview(img_id = item)
            }
        }

    }
}

@Composable
@Preview
fun Netflix_Originals(
){

    val list_of_movies= mutableListOf<Int>()
    list_of_movies.add(R.drawable.movie15)
    list_of_movies.add(R.drawable.movie16)
    list_of_movies.add(R.drawable.movie17)
    list_of_movies.add(R.drawable.movie45)
    list_of_movies.add(R.drawable.movie19)
    list_of_movies.add(R.drawable.movie20)


    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxWidth()
    ) {
        Text(text = "Netflix Originals",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
        LazyRow(){
            itemsIndexed(list_of_movies){
                    index,item->
                movie_preview(img_id = item)
            }
        }

    }
}

@Composable
@Preview
fun Comedies(
){

    val list_of_movies= mutableListOf<Int>()
    list_of_movies.add(R.drawable.movie21)
    list_of_movies.add(R.drawable.movie22)
    list_of_movies.add(R.drawable.movie23)
    list_of_movies.add(R.drawable.movie46)
    list_of_movies.add(R.drawable.movie25)
    list_of_movies.add(R.drawable.movie26)


    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxWidth()
    ) {
        Text(text = "Comedies",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
        LazyRow(){
            itemsIndexed(list_of_movies){
                    index,item->
                movie_preview(img_id = item)
            }
        }

    }
}

@Composable
@Preview
fun Trending_now(
){

    val list_of_movies= mutableListOf<Int>()
    list_of_movies.add(R.drawable.movie27)
    list_of_movies.add(R.drawable.movie28)
    list_of_movies.add(R.drawable.movie29)
    list_of_movies.add(R.drawable.movie30)
    list_of_movies.add(R.drawable.movie31)
    list_of_movies.add(R.drawable.movie32)


    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxWidth()
    ) {
        Text(text = "Trending Now",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
        LazyRow(){
            itemsIndexed(list_of_movies){
                    index,item->
                movie_preview(img_id = item)
            }
        }

    }
}

@Composable
@Preview
fun Top_rated(
){

    val list_of_movies= mutableListOf<Int>()
    list_of_movies.add(R.drawable.movie33)
    list_of_movies.add(R.drawable.movie34)
    list_of_movies.add(R.drawable.movie35)
    list_of_movies.add(R.drawable.movie36)
    list_of_movies.add(R.drawable.movie37)
    list_of_movies.add(R.drawable.movie38)


    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxWidth()
    ) {
        Text(text = "Hot",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
        LazyRow(){
            itemsIndexed(list_of_movies){
                    index,item->
                movie_preview(img_id = item)
            }
        }

    }
}

@Composable
@Preview
fun Drama(
){

    val list_of_movies= mutableListOf<Int>()
    list_of_movies.add(R.drawable.movie39)
    list_of_movies.add(R.drawable.movie40)
    list_of_movies.add(R.drawable.movie41)
    list_of_movies.add(R.drawable.movie42)
    list_of_movies.add(R.drawable.movie43)
    list_of_movies.add(R.drawable.movie44)


    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxWidth()
    ) {
        Text(text = "Drama",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
        LazyRow(){
            itemsIndexed(list_of_movies){
                    index,item->
                movie_preview(img_id = item)
            }
        }

    }
}

@Composable
fun movie_preview(
     img_id :Int
)
{
    Image(painter = painterResource(id = img_id), contentDescription = "boy",
        modifier = Modifier
            .padding(5.dp)
            .size(115.dp, 200.dp),
        contentScale = ContentScale.FillBounds

    )

}

