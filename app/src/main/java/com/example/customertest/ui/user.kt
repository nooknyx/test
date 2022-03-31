import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.customertest.R
import com.example.customertest.databinding.FragmentUserBinding
import com.example.customertest.ui.login.LoginActivity

class user:Fragment(R.layout.fragment_user)
{
    private lateinit var binding: FragmentUserBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentUserBinding.inflate(layoutInflater)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginbtn.setOnClickListener(

            View.OnClickListener {
                requireActivity().run {
                    startActivity(Intent(this, LoginActivity::class.java))
                    return@OnClickListener
                }
            }
        )

        binding.facebook.setOnClickListener(
            View.OnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/SCGLogisticsManagement/")
                    )
                )
            }
                )

    }



}