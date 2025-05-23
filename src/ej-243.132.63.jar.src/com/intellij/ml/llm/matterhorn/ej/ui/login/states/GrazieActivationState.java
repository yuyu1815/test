package com.intellij.ml.llm.matterhorn.ej.ui.login.states;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\002\002\003\001\b\004\005\006\007\b\t\n\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "", "Ready", "Progressing", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIEBlocked;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/AIPBlocked;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Progressing;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Ready;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/StepFail;", "ej-ui"})
public interface GrazieActivationState {
  @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Ready;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "<init>", "()V", "ej-ui"})
  @StabilityInferred(parameters = 1)
  public static final class Ready implements GrazieActivationState {
    @NotNull
    public static final Ready INSTANCE = new Ready();
    
    public static final int $stable;
  }
  
  @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState$Progressing;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "<init>", "()V", "ej-ui"})
  @StabilityInferred(parameters = 1)
  public static final class Progressing implements GrazieActivationState {
    @NotNull
    public static final Progressing INSTANCE = new Progressing();
    
    public static final int $stable;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\GrazieActivationState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */