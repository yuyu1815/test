/*    */ package org.jetbrains.jewel.foundation.lazy;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.functions.Function4;
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
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bf\030\0002\0020\001JI\020\002\032\0020\0032\006\020\004\032\0020\0012\n\b\002\020\005\032\004\030\0010\0012\b\b\002\020\006\032\0020\0072\034\020\b\032\030\022\004\022\0020\n\022\004\022\0020\0030\t¢\006\002\b\013¢\006\002\b\fH&¢\006\002\020\rJ·\001\020\016\032\0020\0032\006\020\017\032\0020\0202!\020\004\032\035\022\023\022\0210\020¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\004\022\0020\0010\t2%\b\002\020\005\032\037\022\023\022\0210\020¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\006\022\004\030\0010\0010\t2#\b\002\020\006\032\035\022\023\022\0210\020¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\004\022\0020\0070\t21\020\024\032-\022\004\022\0020\n\022\023\022\0210\020¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\004\022\0020\0030\025¢\006\002\b\013¢\006\002\b\fH&¢\006\002\020\026JI\020\027\032\0020\0032\006\020\004\032\0020\0012\n\b\002\020\005\032\004\030\0010\0012\b\b\002\020\006\032\0020\0072\034\020\b\032\030\022\004\022\0020\n\022\004\022\0020\0030\t¢\006\002\b\013¢\006\002\b\fH&¢\006\002\020\r¨\006\030"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScope;", "", "item", "", "key", "contentType", "selectable", "", "content", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)V", "items", "count", "", "Lkotlin/ParameterName;", "name", "index", "itemContent", "Lkotlin/Function2;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "foundation"})
/*    */ public interface SelectableLazyListScope
/*    */ {
/*    */   void item(@NotNull Object paramObject1, @Nullable Object paramObject2, boolean paramBoolean, @NotNull Function3<? super SelectableLazyItemScope, ? super Composer, ? super Integer, Unit> paramFunction3);
/*    */   
/*    */   void items(int paramInt, @NotNull Function1<? super Integer, ? extends Object> paramFunction11, @NotNull Function1<? super Integer, ? extends Object> paramFunction12, @NotNull Function1<? super Integer, Boolean> paramFunction1, @NotNull Function4<? super SelectableLazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> paramFunction4);
/*    */   
/*    */   void stickyHeader(@NotNull Object paramObject1, @Nullable Object paramObject2, boolean paramBoolean, @NotNull Function3<? super SelectableLazyItemScope, ? super Composer, ? super Integer, Unit> paramFunction3);
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     private static boolean items$lambda$0(int it) {
/* 40 */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyListScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */