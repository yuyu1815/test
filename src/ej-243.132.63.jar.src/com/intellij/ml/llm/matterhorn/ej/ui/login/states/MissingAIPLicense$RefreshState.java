/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\004\004\005\006\007B\t\b\004¢\006\004\b\002\020\003\001\004\b\t\n\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "", "<init>", "()V", "Initial", "Done", "Progress", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Done;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Initial;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Progress;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public abstract class RefreshState
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   private RefreshState() {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Initial;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "<init>", "()V", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Initial
/*     */     extends RefreshState
/*     */   {
/*     */     @NotNull
/*     */     public static final Initial INSTANCE = new Initial();
/*     */     public static final int $stable;
/*     */     
/*     */     private Initial() {
/* 215 */       super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Done;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class Done extends RefreshState { @NotNull
/* 217 */     public static final Done INSTANCE = new Done(); private Done() { super(null); } public static final int $stable; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class Progress extends RefreshState { @NotNull
/* 219 */     public static final Progress INSTANCE = new Progress(); public static final int $stable; private Progress() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class Error extends RefreshState { @NotNull
/* 221 */     private final String message; public static final int $stable; public Error(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\MissingAIPLicense$RefreshState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */