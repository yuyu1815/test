/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.openapi.components.Service;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieActivationTransmitterService;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class JunieActivationTransmitterService
/*    */ {
/*    */   @NotNull
/*    */   private final CoroutineScope coroutineScope;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public JunieActivationTransmitterService(@NotNull CoroutineScope coroutineScope) {
/* 23 */     this.coroutineScope = coroutineScope; } @NotNull public final CoroutineScope getCoroutineScope() { return this.coroutineScope; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieActivationTransmitterService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */