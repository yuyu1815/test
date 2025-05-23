/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.PublishedApi;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.InlineMarker;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\032\b\020\000\032\0020\001H\000\032-\020\002\032\002H\003\"\004\b\000\020\0032\006\020\004\032\0020\0012\f\020\005\032\b\022\004\022\002H\0030\006H\bø\001\000¢\006\002\020\007\002\007\n\005\b20\001¨\006\b"}, d2 = {"createSynchronizedObject", "Landroidx/compose/ui/text/SynchronizedObject;", "synchronized", "R", "lock", "block", "Lkotlin/Function0;", "(Landroidx/compose/ui/text/SynchronizedObject;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ui-text"})
/*    */ public final class SynchronizationKt
/*    */ {
/*    */   @NotNull
/*    */   public static final SynchronizedObject createSynchronizedObject() {
/* 28 */     return new SynchronizedObject();
/*    */   }
/*    */   
/*    */   @PublishedApi
/*    */   public static final <R> R synchronized(@NotNull SynchronizedObject lock, @NotNull Function0 block) {
/* 33 */     Intrinsics.checkNotNullParameter(lock, "lock"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$synchronized = 0; SynchronizedObject synchronizedObject = lock; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/ui/text/SynchronizedObject}, name=null} */ try { Object object = block.invoke(); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/ui/text/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  return (R)object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\SynchronizationKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */