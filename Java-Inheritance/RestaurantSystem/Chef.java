class Chef extends Person implements Worker {
    Chef(String name,int id){ super(name,id); }
    @Override public void performDuties(){ System.out.println("Cook food"); }
}
