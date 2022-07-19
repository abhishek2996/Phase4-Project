
enum Categories {Linux, Bash, Docker, DevOps};

export class Question{

    id:number;
    question:String;
    description:String;
    multipleAnswers:boolean;
    correctAnswer:String;
    explanation:String;
    tip:String;
    category:string;
    difficulty: String;
    options: Options;
    answers: Answers;
    tags:String;
    optionId:  Options;
    correctAnswerId: Answers;
}


class Options{
    id: number;
    optionA: String;
    optionB:String;
    optionC: String;
    optionD: String;
    optionE: string;
    optionF:String;
}

class Answers{
    id:number;
    answerA:boolean;
    answerB:boolean;
    answerC:boolean;
    answerD:boolean;
    answerE:boolean;
    answerF:boolean;
}