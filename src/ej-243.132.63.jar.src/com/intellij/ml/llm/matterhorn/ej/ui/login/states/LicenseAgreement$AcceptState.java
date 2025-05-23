/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState;", "", "<init>", "()V", "NotAccepted", "InProgress", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$InProgress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$NotAccepted;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class AcceptState
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   private AcceptState() {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$NotAccepted;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState;", "<init>", "()V", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class NotAccepted
/*    */     extends AcceptState
/*    */   {
/*    */     @NotNull
/*    */     public static final NotAccepted INSTANCE = new NotAccepted();
/*    */     public static final int $stable;
/*    */     
/*    */     private NotAccepted() {
/* 68 */       super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState$InProgress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$AcceptState;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1)
/* 69 */   public static final class InProgress extends AcceptState { private InProgress() { super(null); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public static final InProgress INSTANCE = new InProgress();
/*    */     public static final int $stable; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\LicenseAgreement$AcceptState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */