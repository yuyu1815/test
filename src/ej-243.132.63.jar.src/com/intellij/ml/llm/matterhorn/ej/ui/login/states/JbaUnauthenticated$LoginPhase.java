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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\004\004\005\006\007B\t\b\004¢\006\004\b\002\020\003\001\004\b\t\n\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "", "<init>", "()V", "INITIAL", "PROGRESS", "COMPLETED", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$COMPLETED;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$INITIAL;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$PROGRESS;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class LoginPhase
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   private LoginPhase() {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$INITIAL;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "<init>", "()V", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class INITIAL
/*    */     extends LoginPhase
/*    */   {
/*    */     @NotNull
/*    */     public static final INITIAL INSTANCE = new INITIAL();
/*    */     public static final int $stable;
/*    */     
/*    */     private INITIAL() {
/* 75 */       super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$PROGRESS;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class PROGRESS extends LoginPhase { @NotNull
/* 76 */     public static final PROGRESS INSTANCE = new PROGRESS(); private PROGRESS() { super(null); } public static final int $stable; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$COMPLETED;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class COMPLETED extends LoginPhase { @NotNull
/* 77 */     public static final COMPLETED INSTANCE = new COMPLETED(); public static final int $stable; private COMPLETED() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "ej-ui"}) @StabilityInferred(parameters = 1)
/*    */   public static final class Error extends LoginPhase { @NotNull
/* 79 */     private final String message; public static final int $stable; public Error(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\JbaUnauthenticated$LoginPhase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */