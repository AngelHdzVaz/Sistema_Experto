package triagehospitalario;

import Rule.*;

/**
 *
 * @author Janeth
 */
public class TriageHospitalario {

    private BooleanRuleBase baserules = new BooleanRuleBase("Base de Rules");

    private RuleVariable ResulInter1;


    //Variables Rango
   
    private RuleVariable Rango;
   

    //Triage
    private RuleVariable SangradoTransv;
    private RuleVariable Dolor;
    private RuleVariable Liquido;
    private RuleVariable MovFetales;
    private RuleVariable PresArterial;
    private RuleVariable FrecuenciaCardiaca;
    private RuleVariable Temperatura;

   
    private RuleVariable ResulRango;
    private RuleVariable ResulSangradoTransv;
    private RuleVariable ResulDolor;
    private RuleVariable ResulLiquido;
    private RuleVariable ResulMovFetales;
    private RuleVariable ResPresArterial;
    private RuleVariable ResFrecuenciaCardiaca;
    private RuleVariable ResTemperatura;
    private Condition igual;
    
    public BooleanRuleBase getBaserules() {
        return baserules;
    }

    public void setBaserules(BooleanRuleBase baserules) {
        this.baserules = baserules;
    }

    public RuleVariable getResulInter1() {
        return ResulInter1;
    }

    

    public RuleVariable getRango() {
        return Rango;
    }

    public void setRango(RuleVariable Rango) {
        this.Rango = Rango;
    }

    public RuleVariable getSangradoTransv() {
        return SangradoTransv;
    }

    public void setSangradoTransv(RuleVariable SangradoTransv) {
        this.SangradoTransv = SangradoTransv;
    }

    public RuleVariable getDolor() {
        return Dolor;
    }

    public void setDolor(RuleVariable Dolor) {
        this.Dolor = Dolor;
    }


    public RuleVariable getMovFetales() {
        return MovFetales;
    }

    public void setMovFetales(RuleVariable MovFetales) {
        this.MovFetales = MovFetales;
    }

    public RuleVariable getPresArterial() {
        return PresArterial;
    }

    public void setPresArterial(RuleVariable PresArterial) {
        this.PresArterial = PresArterial;
    }

    public RuleVariable getFrecuenciaCardiaca() {
        return FrecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(RuleVariable FrecuenciaCardiaca) {
        this.FrecuenciaCardiaca = FrecuenciaCardiaca;
    }

    public RuleVariable getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(RuleVariable Temperatura) {
        this.Temperatura = Temperatura;
    }

    public RuleVariable getResulRango() {
        return ResulRango;
    }

    public void setResulRango(RuleVariable ResulRango) {
        this.ResulRango = ResulRango;
    }

    public RuleVariable getResulSangradoTransv() {
        return ResulSangradoTransv;
    }

    public void setResulSangradoTransv(RuleVariable ResulSangradoTransv) {
        this.ResulSangradoTransv = ResulSangradoTransv;
    }

    public RuleVariable getResulDolor() {
        return ResulDolor;
    }

    public void setResulDolor(RuleVariable ResulDolor) {
        this.ResulDolor = ResulDolor;
    }

   
    public RuleVariable getResulMovFetales() {
        return ResulMovFetales;
    }

    public void setResulMovFetales(RuleVariable ResulMovFetales) {
        this.ResulMovFetales = ResulMovFetales;
    }

    public RuleVariable getResPresArterial() {
        return ResPresArterial;
    }

    public void setResPresArterial(RuleVariable ResPresArterial) {
        this.ResPresArterial = ResPresArterial;
    }

    public RuleVariable getLiquido() {
        return Liquido;
    }

    public void setLiquido(RuleVariable Liquido) {
        this.Liquido = Liquido;
    }

    public RuleVariable getResulLiquido() {
        return ResulLiquido;
    }

    public void setResulLiquido(RuleVariable ResulLiquido) {
        this.ResulLiquido = ResulLiquido;
    }

    public RuleVariable getResFrecuenciaCardiaca() {
        return ResFrecuenciaCardiaca;
    }

    public void setResFrecuenciaCardiaca(RuleVariable ResFrecuenciaCardiaca) {
        this.ResFrecuenciaCardiaca = ResFrecuenciaCardiaca;
    }

    public RuleVariable getResTemperatura() {
        return ResTemperatura;
    }

    public void setResTemperatura(RuleVariable ResTemperatura) {
        this.ResTemperatura = ResTemperatura;
    }

    public Condition getIgual() {
        return igual;
    }

    public void setIgual(Condition igual) {
        this.igual = igual;
    }
      
    

    public void BaseConocimiento() {

        //Salidas
        igual = new Condition("=");

        //Variables Rango
        ResulInter1 = new RuleVariable(baserules, "");
        Rango = new RuleVariable(baserules, "");
        SangradoTransv= new RuleVariable(baserules, "");
        Dolor= new RuleVariable(baserules, "");
        Liquido= new RuleVariable(baserules, "");
        MovFetales= new RuleVariable(baserules, "");
        PresArterial= new RuleVariable(baserules, "");
        FrecuenciaCardiaca= new RuleVariable(baserules, "");
        Temperatura= new RuleVariable(baserules, "");

        //resultados
        ResulRango= new RuleVariable(baserules, "");
        ResulSangradoTransv= new RuleVariable(baserules, "");
        ResulDolor= new RuleVariable(baserules, "");
        ResulLiquido= new RuleVariable(baserules, "");
        ResulMovFetales= new RuleVariable(baserules, "");
        ResPresArterial= new RuleVariable(baserules, "");
        ResFrecuenciaCardiaca= new RuleVariable(baserules, "");
        ResTemperatura= new RuleVariable(baserules, "");
        
        

    }

    

    public void rules() {

        System.out.println(baserules);

        System.out.println(igual);

        System.out.println(Rango);
        System.out.println(ResulRango);

        //Clasificacion Rango
        
        
        Rule rule1 = new Rule(baserules, "rule1",
                new Clause[]{
                    new Clause(this.Rango, this.igual, "Menor")},
                new Clause(this.ResulRango, this.igual, "Menor Embarazada")
        );

        Rule rule2 = new Rule(baserules, "rule2",
                new Clause[]{
                    new Clause(this.Rango, this.igual, "Adulta")},
                new Clause(this.ResulRango, this.igual, "Adulta Embarazada")
        );

        Rule rule3 = new Rule(baserules, "rule3",
                new Clause[]{
                    new Clause(this.Rango, this.igual, "Mayor")},
                new Clause(this.ResulRango, this.igual, "Mayor Embarazada : Embarazo de alto riesgo, llevar de inmediato a atención \n"
                        + "No mantener en espera por atención")
        );

        //*********************MUJER MAYOR EMBARAZADA RIESGO DIRECTO***********************
//Mujer Menor**********************************
        Rule rule4 = new Rule(baserules, "rule4",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Menor Embarazada"), //1ra
                    new Clause(this.SangradoTransv, this.igual, "No"),
                    new Clause(this.Dolor, this.igual, "No"),
                    new Clause(this.Liquido, this.igual, "No")},
                new Clause(this.ResulInter1, this.igual, "Menor N")
        );
        Rule rule5 = new Rule(baserules, "rule5",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Menor Embarazada"), //2da
                    new Clause(this.SangradoTransv, this.igual, "Si"),
                    new Clause(this.Dolor, this.igual, "No"),
                    new Clause(this.Liquido, this.igual, "No")},
                new Clause(this.ResulInter1, this.igual, "Menor S")
        );

        Rule rule6 = new Rule(baserules, "rule6",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Menor Embarazada"),//3ra
                    new Clause(this.SangradoTransv, this.igual, "No"),
                    new Clause(this.Dolor, this.igual, "Si"),
                    new Clause(this.Liquido, this.igual, "No")},
                new Clause(this.ResulInter1, this.igual, "Menor Dolor: Llevar de inmediato a sala de choque para atención")
        );

        Rule rule7 = new Rule(baserules, "rule7",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Menor Embarazada"), //4ta
                    new Clause(this.SangradoTransv, this.igual, "No"),
                    new Clause(this.Dolor, this.igual, "No"),
                    new Clause(this.Liquido, this.igual, "Si")},
                new Clause(this.ResulInter1, this.igual, "Menor con flujo de liquido Amniotico: LLevar a sala de choque para su atención")
        );

        Rule rule8 = new Rule(baserules, "rule8",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Menor Embarazada"), //5ta
                    new Clause(this.SangradoTransv, this.igual, "Si"),
                    new Clause(this.Dolor, this.igual, "Si"),
                    new Clause(this.Liquido, this.igual, "No")},
                new Clause(this.ResulInter1, this.igual, "Menor con Sangrado y Dolor: Llevar de inmediato a atención")
        );

        Rule rule9 = new Rule(baserules, "rule9",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Menor Embarazada"), //6ta
                    new Clause(this.SangradoTransv, this.igual, "Si"),
                    new Clause(this.Dolor, this.igual, "No"),
                    new Clause(this.Liquido, this.igual, "Si")},
                new Clause(this.ResulInter1, this.igual, "Menor con Sangrado y Flujo de Liquido: Llevar de inmediato a atención ")
        );

        Rule rule10 = new Rule(baserules, "rule10",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Menor Embarazada"),
                    new Clause(this.SangradoTransv, this.igual, "No"),
                    new Clause(this.Dolor, this.igual, "Si"),
                    new Clause(this.Liquido, this.igual, "Si")},
                new Clause(this.ResulInter1, this.igual, "Menor con Dolor y Flujo de Liquido:Llevar de inmediato a atención")
        );

        Rule rule11 = new Rule(baserules, "rule11",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Menor Embarazada"), //7ma
                    new Clause(this.SangradoTransv, this.igual, "Si"),
                    new Clause(this.Dolor, this.igual, "Si"),
                    new Clause(this.Liquido, this.igual, "Si")},
                new Clause(this.ResulInter1, this.igual, "Menor con Sangrado, Dolor y Flujo: Emergencia de alto riesgo")
        );

        //movFetaless N
        Rule rule12 = new Rule(baserules, "rule12",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Menor N"),
                    new Clause(this.MovFetales, this.igual, "No"),},
                new Clause(this.ResulMovFetales, this.igual, "Menor Sin Movimientos Fetales: Canalizar a ultrasonido")//salida emergencia

        );

        Rule rule13 = new Rule(baserules, "rule13",
                new Clause[]{
                    new Clause(ResulInter1, this.igual, "Menor N"),
                    new Clause(this.MovFetales, this.igual, "Si"),},
                new Clause(this.ResulMovFetales, this.igual, "Menor Pasa")//Sigue

        );

        //Menor S
        Rule rule14 = new Rule(baserules, "rule14",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Menor S"),
                    new Clause(this.MovFetales, this.igual, "No"),},
                new Clause(this.ResulMovFetales, this.igual, "Menor Sangrado y Ausencia de Movimientos: Atencion inmediata de médico") //salida emergencia

        );

        Rule rule15 = new Rule(baserules, "rule15",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Menor S"),
                    new Clause(this.MovFetales, this.igual, "Si"),},
                new Clause(this.ResulMovFetales, this.igual, "Menor Pasa")//Sigue

        );
/*
        //Menor St 
        Rule rule16 = new Rule(baserules, "rule16",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Menor St"),
                    new Clause(this.MovFetales, this.igual, "No"),},
                new Clause(this.ResulMovFetales, this.igual, "Menor Urgencia3")//salida emergencia

        );

        Rule rule17 = new Rule(baserules, "rule17",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Menor St"),
                    new Clause(this.MovFetales, this.igual, "Si"),},
                new Clause(this.ResulMovFetales, this.igual, "Menor Pasa")//Sigue

        );
*/
        //Menor salida Hipertencion
        Rule rule18 = new Rule(baserules, "rule18",
                new Clause[]{
                    new Clause(this.ResulMovFetales, this.igual, "Menor Pasa"),
                    new Clause(this.PresArterial, this.igual, "Normal"),},
                new Clause(this.ResPresArterial, this.igual, "Menor Pasa")//sigue

        );
//menor s
        Rule rule19 = new Rule(baserules, "rule19",
                new Clause[]{
                    new Clause(this.ResulMovFetales, this.igual, "Menor Pasa"),
                    new Clause(this.PresArterial, this.igual, "Alta"),},
                new Clause(this.ResPresArterial, this.igual, "Menor con presión Arterial ; Enviar a sala de choque")//salida emergencia hipertension

        );

        //Menor salida Frecuencia Cardiaca
        Rule rule20 = new Rule(baserules, "rule20",
                new Clause[]{
                    new Clause(this.ResPresArterial, this.igual, "Menor Pasa"),
                    new Clause(this.FrecuenciaCardiaca, this.igual, "Regular"),},
                new Clause(this.ResFrecuenciaCardiaca, this.igual, "Menor Pasa")//sigue

        );
//menor s
        Rule rule21 = new Rule(baserules, "rule21",
                new Clause[]{
                    new Clause(this.ResPresArterial, this.igual, "Menor Pasa"),
                    new Clause(this.FrecuenciaCardiaca, this.igual, "Media"),},
                new Clause(this.ResFrecuenciaCardiaca, this.igual, "Menor Pasa")//sigue

        );
        Rule rule22 = new Rule(baserules, "rule22",
                new Clause[]{
                    new Clause(this.ResPresArterial, this.igual, "Menor Pasa"),
                    new Clause(this.FrecuenciaCardiaca, this.igual, "Alta"),},
                new Clause(this.ResFrecuenciaCardiaca, this.igual, "Menor con Frecuencia Cardiaca irregular: Enviar a sala de choque")// salida urgencia

        );

        //Menor Temperatura
        Rule rule23 = new Rule(baserules, "rule23",
                new Clause[]{
                    new Clause(this.ResFrecuenciaCardiaca, this.igual, "Menor Pasa"),
                    new Clause(this.Temperatura, this.igual, "Normal"),},
                new Clause(this.ResTemperatura, this.igual, "Menor Pasa")//sigue
        );

        Rule rule24 = new Rule(baserules, "rule24",
                new Clause[]{
                    new Clause(this.ResFrecuenciaCardiaca, this.igual, "Menor Pasa"),
                    new Clause(this.Temperatura, this.igual, "Anormal"),},
                new Clause(this.ResTemperatura, this.igual, "Menor con temperatura irregular: Mantener revisiones")//sigue
        );
        
        Rule rule25 = new Rule(baserules, "rule25",
                new Clause[]{
                    new Clause(this.ResFrecuenciaCardiaca, this.igual, "Menor Pasa"),
                    new Clause(this.Temperatura, this.igual, "Alta"),},
                new Clause(this.ResTemperatura, this.igual, "Menor con temperatura alta: Enviar a sala de choque")//sigue
        );

//Mujer Adulta
        Rule rule26 = new Rule(baserules, "rule26",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Adulta Embarazada"), //1ra
                    new Clause(this.SangradoTransv, this.igual, "No"),
                    new Clause(this.Dolor, this.igual, "No"),
                    new Clause(this.Liquido, this.igual, "No")},
                new Clause(this.ResulInter1, this.igual, "Adulta N")
        );
        Rule rule27 = new Rule(baserules, "rule27",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Adulta Embarazada"), //2da
                    new Clause(this.SangradoTransv, this.igual, "Si"),
                    new Clause(this.Dolor, this.igual, "No"),
                    new Clause(this.Liquido, this.igual, "No")},
                new Clause(this.ResulInter1, igual, "Adulta S")
        );

        Rule rule28 = new Rule(baserules, "rule28",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Adulta Embarazada"),//3ra
                    new Clause(this.SangradoTransv, this.igual, "No"),
                    new Clause(this.Dolor, this.igual, "Si"),
                    new Clause(this.Liquido, this.igual, "No")},
                new Clause(this.ResulInter1, this.igual, "Adulta Dolor: Llevar de inmediato a sala de choque para atención")
        );

        Rule rule29 = new Rule(baserules, "rule29",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Adulta Embarazada"), //4ta
                    new Clause(this.SangradoTransv, this.igual, "No"),
                    new Clause(this.Dolor, this.igual, "No"),
                    new Clause(this.Liquido, this.igual, "Si")},
                new Clause(this.ResulInter1, this.igual, "Adulta con flujo de liquido Amniotico: LLevar a sala de choque para su atención")
        );

        Rule rule30 = new Rule(baserules, "rule30",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Adulta Embarazada"), //5ta
                    new Clause(this.SangradoTransv, this.igual, "Si"),
                    new Clause(this.Dolor, this.igual, "Si"),
                    new Clause(this.Liquido, this.igual, "No")},
                new Clause(this.ResulInter1, this.igual, "Adulta con Sangrado y Dolor: Llevar de inmediato a atención")
        );

        Rule rule31 = new Rule(baserules, "rule31",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Adulta Embarazada"), //6ta
                    new Clause(this.SangradoTransv, this.igual, "Si"),
                    new Clause(this.Dolor, this.igual, "No"),
                    new Clause(this.Liquido, this.igual, "Si")},
                new Clause(this.ResulInter1, this.igual, "Adulta con Sangrado y Flujo de Liquido: Llevar de inmediato a atención")
        );

        Rule rule32 = new Rule(baserules, "rule32",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Adulta Embarazada"),
                    new Clause(this.SangradoTransv, this.igual, "No"),
                    new Clause(this.Dolor, this.igual, "Si"),
                    new Clause(this.Liquido, this.igual, "Si")},
                new Clause(this.ResulInter1, this.igual, "Adulta con Dolor y Flujo de Liquido:Llevar de inmediato a atención")
        );

        Rule rule33 = new Rule(baserules, "rule33",
                new Clause[]{
                    new Clause(this.ResulRango, this.igual, "Adulta Embarazada"), //7ma
                    new Clause(this.SangradoTransv, this.igual, "Si"),
                    new Clause(this.Dolor, this.igual, "Si"),
                    new Clause(this.Liquido, this.igual, "Si")},
                new Clause(this.ResulInter1, this.igual, "Adulta con Sangrado, Dolor y Flujo: Emergencia de alto riesgo")
        );

        //movFetaless N
        Rule rule34 = new Rule(baserules, "rule34",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Adulta N"),
                    new Clause(this.MovFetales, this.igual, "No"),},
                new Clause(this.ResulMovFetales, this.igual, "Adulta Sin Movimientos Fetales: Canalizar a ultrasonido")//salida emergencia

        );

        Rule rule35 = new Rule(baserules, "rule35",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Adulta N"),
                    new Clause(this.MovFetales, this.igual, "Si"),},
                new Clause(this.ResulMovFetales, this.igual, "Adulta Pasa")//Sigue

        );

        //Menor S
        Rule rule36 = new Rule(baserules, "rule36",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Adulta S"),
                    new Clause(this.MovFetales, this.igual, "No"),},
                new Clause(this.ResulMovFetales, this.igual, "Adulta Sangrado y Ausencia de Movimientos: Atencion inmediata de médico")//salida emergencia

        );

        Rule rule37 = new Rule(baserules, "rule37",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Adulta S"),
                    new Clause(this.MovFetales, this.igual, "Si"),},
                new Clause(this.ResulMovFetales, this.igual, "Adulta Pasa")//Sigue

        );
/*
        //Menor St Fetales
        Rule rule38 = new Rule(baserules, "rule38",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Adulta St"),
                    new Clause(this.MovFetales, this.igual, "No"),},
                new Clause(this.ResulMovFetales, this.igual, "Adulta Urgencia3")//salida emergencia

        );

        Rule rule39 = new Rule(baserules, "rule39",
                new Clause[]{
                    new Clause(this.ResulInter1, this.igual, "Adulta St"),
                    new Clause(this.MovFetales, this.igual, "Si"),},
                new Clause(this.ResulMovFetales, this.igual, "Adulta Pasa")//Sigue

        );
*/
        //Adlta salida Hipertencion
        Rule rule40 = new Rule(baserules, "rule40",
                new Clause[]{
                    new Clause(this.ResulMovFetales, this.igual, "Adulta Pasa"),
                    new Clause(this.PresArterial, this.igual, "Normal"),},
                new Clause(this.ResPresArterial, this.igual, "Adulta Pasa")//sigue

        );
//
        Rule rule41 = new Rule(baserules, "rule41",
                new Clause[]{
                    new Clause(this.ResulMovFetales, this.igual, "Adulta Pasa"),
                    new Clause(this.PresArterial, this.igual, "Alta"),},
                new Clause(this.ResPresArterial, this.igual, "Adulta Presion Arterial alta: Enviar a ala de choque")//salida emergencia

        );

        //Menor salida Frecuencia Cardiaca
        Rule rule42 = new Rule(baserules, "rule42",
                new Clause[]{
                    new Clause(this.ResPresArterial, this.igual, "Adulta Pasa"),
                    new Clause(this.FrecuenciaCardiaca, this.igual, "Regular"),},
                new Clause(this.ResFrecuenciaCardiaca, this.igual, "Adulta Pasa")//sigue

        );
//menor s
        Rule rule43 = new Rule(baserules, "rule43",
                new Clause[]{
                    new Clause(this.ResPresArterial, this.igual, "Adulta Pasa"),
                    new Clause(this.FrecuenciaCardiaca, this.igual, "Media"),},
                new Clause(this.ResFrecuenciaCardiaca, this.igual, "Adulta Pasa")//sigue

        );
        Rule rule44 = new Rule(baserules, "rule44",
                new Clause[]{
                    new Clause(this.ResPresArterial, this.igual, "Aulta Pasa"),
                    new Clause(this.FrecuenciaCardiaca, this.igual, "Alta"),},
                new Clause(this.ResFrecuenciaCardiaca, this.igual, "Adulta : Frecuencia Cardiaca Alta en viar a sala de choque")// salida urgencia

        );

        //Menor Temperatura
        Rule rule45 = new Rule(baserules, "rule45",
                new Clause[]{
                    new Clause(this.ResFrecuenciaCardiaca, this.igual, "Adulta Pasa"),
                    new Clause(this.Temperatura, this.igual, "Normal"),},
                new Clause(this.ResTemperatura, this.igual, "Adulta Pasa")//sigue
        );

        Rule rule46 = new Rule(baserules, "rule46",
                new Clause[]{
                    new Clause(this.ResFrecuenciaCardiaca, this.igual, "Adulta Pasa"),
                    new Clause(this.Temperatura, this.igual, "Anormal"),},
                new Clause(this.ResTemperatura, this.igual, "Adulta con sintoma anormal: Mantener revision constante")//sigue
        );
        
        Rule rule47 = new Rule(baserules, "rule47",
                new Clause[]{
                    new Clause(this.ResFrecuenciaCardiaca, this.igual, "Adulta Pasa"),
                    new Clause(this.Temperatura, this.igual, "Alta"),},
                new Clause(this.ResTemperatura, this.igual, "Adulta con temperatura alta enviar a sala de choque para atención")//sigue
        );
        /*Rule rule 48 = new Rule(baserules, "rule48",
                new Clause[]{
                    new Clause(this.Dolor,this.igual,""),},
                new Clause(this.ResEror,this.igual,"Error temperatura")
        );
                    
                */

    }

}
