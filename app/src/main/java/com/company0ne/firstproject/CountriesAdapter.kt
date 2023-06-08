package com.company0ne.firstproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView


class CountriesAdapter(


    var countryNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context) : RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>(){

    class CountryViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        var textViewCountryname : TextView = itemView.findViewById(R.id.textViewCountryName)
        var textViewDetails : TextView = itemView.findViewById(R.id.textViewDetails)
        var imageView : CircleImageView = itemView.findViewById(R.id.imageView)
        var cardView : CardView = itemView.findViewById(R.id.cardView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_design,parent,false)
        return CountryViewHolder(view)

    }

    override fun getItemCount(): Int {
        //here we need to size of the array
        //return 3

        return countryNameList.size

    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {

        holder.textViewCountryname.text= countryNameList.get(position)
        holder.textViewDetails.text  = detailsList.get(position)
        holder.imageView.setImageResource(imageList.get(position))

        holder.cardView.setOnClickListener {


            //pass data through intent to the SecondActivity
            val intent = Intent(context, SecondActivity::class.java)
            //Passing the data
            intent.putExtra("countryName", countryNameList[position])
            intent.putExtra("countryDetails", detailsList[position])


            // Add any additional data you want to pass
            context.startActivity(intent)


            //show AlertDialog on OnclickListener
//            showAlertDialog(countryNameList[position])


//            Toast.makeText(context,"You selected the ${countryNameList.get(position)}",Toast.LENGTH_SHORT)
//                .show()
        }
    }
//    //fun creating the alertDialog
//    private fun showAlertDialog(countryName: String) {
//        val alertDialog = AlertDialog.Builder(context)
//            .setTitle("Alert")
//                //set message you want to display
//            .setMessage("You selected: $countryName Flag"  )
//                //set positive button
//            .setPositiveButton("OK") { dialog, _ ->
//                dialog.dismiss()
//
//            }
//                //set negative button
//            .setNegativeButton("Cancel") { dialog, _ ->
//                dialog.dismiss()
//            }
//
//            .create()
//        alertDialog.show()
//}
    }




