/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls
/*    */ {
/*    */   @Nullable
/*    */   public static Object beforeProjectOpened(@NotNull MatterhornStarter $this, @NotNull Path projectDir, @NotNull Continuation $completion) {
/* 31 */     return Unit.INSTANCE;
/*    */   } @Nullable
/* 33 */   public static Object configureProject(@NotNull MatterhornStarter $this, @NotNull String name, @NotNull List args, @NotNull RootExecutionContext context, @NotNull Continuation $completion) { return Unit.INSTANCE; } @Nullable
/*    */   public static Object validateProject(@NotNull MatterhornStarter $this, @NotNull String name, @NotNull List args, @NotNull RootExecutionContext context, @NotNull Continuation $completion) {
/* 35 */     return CollectionsKt.emptyList();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\MatterhornStarter$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */