package com.jap.marksevaluation;

public class OakBridgeSchool
{
    // This function takes as input the marks of all subjects and returns a total marks of each of the students
    public int[] calculateTotalMarks(int [] math,int science[], int[] english, int[] language,int[] social)
    {
        int total[]=new int[math.length];
        for(int i=0;i<math.length;i++)
        {
            total[i] = math[i] + science[i] + english[i] + language[i] + social[i];

        }
        return total;
    }
    // This function takes as input the total marks of each student and return
    // the average total marks of each student
    public int[] calculateAverageTotalMarks(int[] totalMarks)
    {
        int averageTotalMarks[] = new int[totalMarks.length];
        for(int i=0;i<totalMarks.length;i++)
        {
            averageTotalMarks[i]= totalMarks[i]/5;
        }
        return averageTotalMarks ;
    }
    // This function takes as input the math marks and returns the average score by all students
    public int calculateAverageMathMarks (int[] math)
    {
        int averageMathMarks;
        int total=0;
        for(int i=0;i<math.length;i++)
        {
            total = total+math[i];
        }
        averageMathMarks=total/math.length;
        return averageMathMarks;
    }
    // This function takes as input the science marks and returns the average score by all students
    public int calculateAverageScienceMarks (int[] science)
    {
        int averageScienceMarks;
        int total=0;
        for(int i=0;i<science.length;i++)
        {
            total=total+science[i];
        }
        averageScienceMarks = total/science.length;
        return averageScienceMarks;
    }
    // This function takes as input the social marks and returns the average score by all students
    public int calculateAverageSocialMarks (int[] social)
    {
        int averageSocialMarks;
        int total=0;
        for(int i=0;i<social.length;i++)
        {
            total=total+social[i];
        }
        averageSocialMarks=total/social.length;
        return averageSocialMarks;
    }
    // This function takes as input the language marks and returns the average score by all students
    public int calculateAverageLanguageMarks (int[] language)
    {
        int averageLanguageMarks;
        int total=0;
        for(int i=0;i<language.length;i++)
        {
            total=total+language[i];
        }
        averageLanguageMarks=total/language.length;
        return averageLanguageMarks;
    }
    // This function takes as input the english marks and returns the average score by all students
    public int calculateAverageEnglishMarks (int[] english)
    {
        int averageEnglishMarks;
        int total=0;
        for(int i=0;i<english.length;i++)
        {
            total = total+english[i];
        }
        averageEnglishMarks=total/english.length;
        return averageEnglishMarks;
    }
    // This function takes as input the total marks of each student and the student names
    // and returns the name os the top scorer
    public String findTopScorer(int[] totalMarks,String [] studentNames)
    {
        int temp;
        String temp1;
        int pass =1;
        while(pass<totalMarks.length-1)
        {
            for(int i=0;i<totalMarks.length-1;i++)
            {
                if(totalMarks[i]>totalMarks[i+1])
                {
                    temp=totalMarks[i];
                    totalMarks[i]=totalMarks[i+1];
                    totalMarks[i+1]=temp;

                    temp1=studentNames[i];
                    studentNames[i]=studentNames[i+1];
                    studentNames[i+1]=temp1;
                }
            }
            pass++;
        }
        String topScorer =studentNames[studentNames.length-1];
        //return the name of  the top scorer , extract the name from the studentNames array
        return topScorer;
    }
    // This function takes as input all the marks in subjects and returns
    // as an array of 1 and 0 the passed and failed student status
    // 1 - pass
    // 0 - fail
    public int[] isPassed(int [] math, int science[], int[] social, int[] language,int[] english)
    {
        int result[] = new int[math.length];
        for(int i=0;i<math.length;i++)
        {
            if(math[i]<35 || science[i]<35 || social[i]<35 || language[i]<35 || english[i]<35)
            {
                result[i]=0;
            }
            else
            {
                result[i]=1;
            }
        }
        return result;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of failed students who need to re appear for the exam
    public String[] listOfStudentsToReAppearForExam(int [] passFailStatus,String studentNames[])
    {
        int n=0;
        for(int j=0;j<passFailStatus.length;j++)
        {
            if(passFailStatus[j]==0)
            {
                n = n + 1;
            }
        }
        String reAppearForExam[]=new String[n];
        int x=0;
        for(int i=0;i<studentNames.length;i++)
        {
            if(passFailStatus[i]==0)
            {
                reAppearForExam[x]=studentNames[i];
                x++;
            }
        }
        return reAppearForExam;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of passed students
    public String[] listOfStudentsPassedTheExam(int [] studentIndex,String studentNames[])
    {
        int n=0;
        for(int j=0;j<studentNames.length;j++)
        {
            if(studentIndex[j]==1)
            {
                n=n+1;
            }
        }
        String passedExam[]= new String[n];
        int x=0;
        for(int i=0;i<studentNames.length;i++)
        {
            if(studentIndex[i]==1)
            {
                passedExam[x]=studentNames[i];
                x++;
            }
        }
        return passedExam;
    }
    // This function takes as input the average total marks of students
    // and returns the grade accordingly

    public char[] generateGrades(int [] averageTotalMarks)
    {
        char grade[]= new char[averageTotalMarks.length];
        for(int i=0;i<averageTotalMarks.length;i++)
        {
            if(averageTotalMarks[i]>=90)
            {
                grade[i]='A';
            }
            else if(averageTotalMarks[i]<90 && averageTotalMarks[i]>=80)
            {
                grade[i]='B';
            }
            else if(averageTotalMarks[i]<80 && averageTotalMarks[i]>=70)
            {
                grade[i]='C';
            }
            else if(averageTotalMarks[i]<70 && averageTotalMarks[i]>=60)
            {
                grade[i]='D';
            }
            else if(averageTotalMarks[i]<60 && averageTotalMarks[i]>=50)
            {
                grade[i]='E';
            }
            else
            {
                grade[i]='F';
            }
        }
        return grade;
    }

        //This function takes the total marks of students and roll numbers abd returns the roll nos
        // in sorted order of total marks from smallest score to highest score
    public int[] sortByTotalMarks(int[] totalMarks,int [] rollNos)
    {
        int temp;
        int temp2;
        int pass=1;
        while(pass<totalMarks.length-1)
        {
            for(int i=0;i<totalMarks.length-1;i++)
            {
                if(totalMarks[i]>totalMarks[i+1])
                {
                    temp=totalMarks[i];
                    totalMarks[i]=totalMarks[i+1];
                    totalMarks[i+1]=temp;

                    temp2=rollNos[i];
                    rollNos[i]=rollNos[i+1];
                    rollNos[i+1]=temp2;
                }
            }
            pass++;
        }
        return rollNos;
    }
}