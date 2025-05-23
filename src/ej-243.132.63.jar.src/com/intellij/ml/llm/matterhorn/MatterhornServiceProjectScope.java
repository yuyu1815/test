/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import com.intellij.openapi.components.Service;
/*    */ import kotlin.Metadata;
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
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/MatterhornServiceProjectScope;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "core"})
/*    */ public final class MatterhornServiceProjectScope
/*    */ {
/*    */   @NotNull
/*    */   private final CoroutineScope scope;
/*    */   
/*    */   public MatterhornServiceProjectScope(@NotNull CoroutineScope scope) {
/* 33 */     this.scope = scope; } @NotNull public final CoroutineScope getScope() { return this.scope; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\MatterhornServiceProjectScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */