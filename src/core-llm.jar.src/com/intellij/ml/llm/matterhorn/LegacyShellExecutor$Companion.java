/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\b\b\002\020\r\032\0020\016R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor$Companion;", "", "<init>", "()V", "COMMAND_COMPLETE_MARKER", "", "COMMAND_EXIT_CODE_MARKER", "COMMAND_EXIT_CODE_ENV_VAR", "COMMAND_START_MARKER", "launchLegacyExecutor", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "policy", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final ShellExecutor launchLegacyExecutor(@NotNull CoroutineScope scope, @NotNull ShellExecutor.CancellationPolicy policy) {
/* 36 */     Intrinsics.checkNotNullParameter(scope, "scope"); Intrinsics.checkNotNullParameter(policy, "policy"); LegacyShellExecutor legacyShellExecutor1 = new LegacyShellExecutor(scope, policy), it = legacyShellExecutor1; int $i$a$-also-LegacyShellExecutor$Companion$launchLegacyExecutor$1 = 0;
/* 37 */     LegacyShellExecutor.access$initExecutor(it);
/*    */     return legacyShellExecutor1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\LegacyShellExecutor$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */