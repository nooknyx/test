import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.customertest.R
import com.example.customertest.databinding.FragmentHomeBinding
import com.example.customertest.databinding.FragmentTrackingBinding
import com.example.customertest.ui.homechoice.TrackingStatus
import com.example.customertest.ui.homechoice.imexpage
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.firestore.FirebaseFirestore
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

class Tracking:Fragment(R.layout.fragment_tracking)
{
    private lateinit var binding: FragmentTrackingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTrackingBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        binding.searchbtn.setOnClickListener(


        return sendPostRequest("chatbotuser", "s=0zO&@]")

        )
    }

    private fun sendPostRequest(userName: String, password: String) {

            var reqParam = URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode(userName, "UTF-8")
            reqParam += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password,"UTF-8")
            val mURL = URL("https://schema.getpostman.com/json/collection/v2.1.0/collection.json")

            with(mURL.openConnection() as HttpURLConnection) {
                // optional default is GET
                requestMethod = "POST"

                val wr = OutputStreamWriter(getOutputStream());
                wr.write(reqParam);
                wr.flush();

                println("URL : $url")
                println("Response Code : $responseCode")

                BufferedReader(InputStreamReader(inputStream)).use {
                    val response = StringBuffer()

                    var inputLine = it.readLine()
                    while (inputLine != null) {
                        response.append(inputLine)
                        inputLine = it.readLine()
                    }
                    println("Response : $response")
                }
            }
        }



}

