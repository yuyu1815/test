/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\0327\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032\027\020\004\032\023\022\004\022\002H\002\022\004\022\002H\0030\005¢\006\002\b\006¨\006\007"}, d2 = {"lazyWithReceiver", "Lai/grazie/utils/LazyWithReceiver;", "This", "T", "initializer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "utils-common"})
/*    */ public final class LazyWithReceiverKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <This, T> LazyWithReceiver<This, T> lazyWithReceiver(@NotNull Function1<? super This, ? extends T> initializer) {
/* 21 */     Intrinsics.checkNotNullParameter(initializer, "initializer"); return new LazyWithReceiverImpl<>(initializer);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\LazyWithReceiverKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */