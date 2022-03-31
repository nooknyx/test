import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.customertest.R
import com.example.customertest.databinding.FragmentHomeBinding
import com.example.customertest.ui.homechoice.crosspage
import com.example.customertest.ui.homechoice.domespage
import com.example.customertest.ui.homechoice.imexpage
import com.example.customertest.ui.homechoice.overseapage


class Home:Fragment(R.layout.fragment_home)
{

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.imex.setOnClickListener(

            View.OnClickListener {
                requireActivity().run {
                    startActivity(Intent(this, imexpage::class.java))
                    return@OnClickListener
                }
            }
        )

        binding.crossbor.setOnClickListener(

            View.OnClickListener {
                requireActivity().run {
                    startActivity(Intent(this, crosspage::class.java))
                    return@OnClickListener
                }
            }
        )

        binding.domestic.setOnClickListener(
            View.OnClickListener {
                requireActivity().run {
                    startActivity(Intent(this, domespage::class.java))
                    return@OnClickListener
                }
            }
        )

        binding.overall.setOnClickListener(

            View.OnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.scglogistics.co.th/home/")
                    )
                )
            }
        )

        binding.oversea.setOnClickListener(

            View.OnClickListener {
                requireActivity().run {
                    startActivity(Intent(this, overseapage::class.java))
                    return@OnClickListener
                }
            }
        )
    }



}

/*fun ImageButton.setOnClickListener(startActivity: Unit)
{
    fun onClick(){
        return
    }
}*/
