/*    */ package androidx.collection.internal;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J%\020\003\032\002H\004\"\004\b\000\020\0042\f\020\005\032\b\022\004\022\002H\0040\006H\bø\001\000¢\006\002\020\007\002\007\n\005\b20\001¨\006\b"}, d2 = {"Landroidx/collection/internal/Lock;", "", "()V", "synchronizedImpl", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "collection"})
/*    */ public final class Lock
/*    */ {
/*    */   public final <T> T synchronizedImpl(@NotNull Function0 block) {
/* 26 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$synchronizedImpl = 0; Lock lock = this; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/collection/internal/Lock}, name=null} */ try { Object object = block.invoke(); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/collection/internal/Lock}, name=null} */ InlineMarker.finallyEnd(1); }  return (T)object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\internal\Lock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */