package com.Gestione_Incendi.Project.model;

public interface SubjectSonda {
	public void register(ObserverCentroControllo oc);
	public void unregister(ObserverCentroControllo oc);
	public void notifyAll(String s);
}
