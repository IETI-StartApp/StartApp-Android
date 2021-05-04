package com.ieti.startapp_android.view.card;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ieti.startapp_android.R;
import com.ieti.startapp_android.cardProjectElement;

public class ViewHolder extends  RecyclerView.ViewHolder{
        //private ImageView userImageView;
        private TextView userName, dateProject, projectName, goalProject, financeProject, progressProject, investorProject;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            //userImageView = itemView.findViewById(R.id.cardUserImageView);
            userName = itemView.findViewById(R.id.cardUserTextView);
            dateProject = itemView.findViewById(R.id.dateProjectTextView);
            projectName = itemView.findViewById(R.id.cardProjectTitleTextView);
            goalProject = itemView.findViewById(R.id.cardProjectGoalTextView);
            financeProject = itemView.findViewById(R.id.cardPriceTextView);
            progressProject = itemView.findViewById(R.id.cardProgressTextView);
            investorProject = itemView.findViewById(R.id.cardInvestorTextView);
        }
        void bindData(final cardProjectElement card){
            //linea para cambiar la imagen

            userName.setText(card.getUserOwnProject());
            dateProject.setText(card.getDateProject());
            projectName.setText(card.getProjectName());
            goalProject.setText(card.getGoalProject());
            financeProject.setText(card.getFinanceProject());
            progressProject.setText(card.getProgressProject());
            investorProject.setText(card.getInvestorProject());
        }
}
