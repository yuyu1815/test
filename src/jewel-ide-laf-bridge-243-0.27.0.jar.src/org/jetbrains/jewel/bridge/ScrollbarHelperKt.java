/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\005\"\033\020\000\032\0020\0018BX\002¢\006\f\n\004\b\004\020\005\032\004\b\002\020\003¨\006\006"}, d2 = {"scrollbarService", "Lorg/jetbrains/jewel/bridge/MacScrollbarHelperImpl;", "getScrollbarService", "()Lorg/jetbrains/jewel/bridge/MacScrollbarHelperImpl;", "scrollbarService$delegate", "Lkotlin/Lazy;", "ide-laf-bridge"})
/*    */ public final class ScrollbarHelperKt
/*    */ {
/*    */   @NotNull
/* 28 */   private static final Lazy scrollbarService$delegate = LazyKt.lazy(ScrollbarHelperKt::scrollbarService_delegate$lambda$0); private static final MacScrollbarHelperImpl scrollbarService_delegate$lambda$0() { return new MacScrollbarHelperImpl(); } private static final MacScrollbarHelperImpl getScrollbarService() { Lazy lazy = scrollbarService$delegate; return (MacScrollbarHelperImpl)lazy.getValue(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\ScrollbarHelperKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */