package co.uk.wob.sealed;

public sealed interface Vehicle permits Train, Bus, Bike {
}
