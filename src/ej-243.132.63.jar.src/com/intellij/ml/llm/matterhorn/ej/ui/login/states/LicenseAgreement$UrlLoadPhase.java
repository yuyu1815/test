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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\003\004\005\006B\t\b\004¢\006\004\b\002\020\003\001\003\007\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "", "<init>", "()V", "Progress", "Completed", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Completed;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Progress;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class UrlLoadPhase
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   private UrlLoadPhase() {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "<init>", "()V", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class Progress
/*    */     extends UrlLoadPhase
/*    */   {
/*    */     @NotNull
/*    */     public static final Progress INSTANCE = new Progress();
/*    */     public static final int $stable;
/*    */     
/*    */     private Progress() {
/* 62 */       super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Completed;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class Completed extends UrlLoadPhase { @NotNull
/* 63 */     private final String url; public Completed(@NotNull String url) { super(null); this.url = url; } public static final int $stable; @NotNull public final String getUrl() { return this.url; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class Error extends UrlLoadPhase { @NotNull
/* 64 */     private final String message; public static final int $stable; public Error(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\LicenseAgreement$UrlLoadPhase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */