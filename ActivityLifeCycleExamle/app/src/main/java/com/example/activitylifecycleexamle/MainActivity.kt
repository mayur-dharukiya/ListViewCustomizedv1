package com.example.activitylifecycleexamle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import com.example.activitylifecycleexamle.ui.theme.ActivityLifeCycleExamleTheme

class MainActivity : ComponentActivity() {
    override fun onStart() {
        super.onStart()
        Log.d("OnStart()","Inside OnStart Function")
        //you should load data from server into collection

    }
//    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
//     fun initializeCamera()
//    {
//         if(camera==null)
//         {
//             getCamera()
//         }
//     }


    override fun onPause() {
        super.onPause()
        Log.d("onPause()","Inside onPause() Function")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume()","Inside onResume() Function")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("onRestart()","Inside onRestart() Function")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop()","Inside onStop() Function")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy()","Inside onDestroy() Function")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("OnCreate()","Inside OnCreate Function")
        setContent {
            ActivityLifeCycleExamleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ActivityLifeCycleExamleTheme {
        Greeting("Android")
    }
}