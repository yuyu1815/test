/*    */ package androidx.collection.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.InlineMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\022\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\0326\020\000\032\002H\001\"\004\b\000\020\001*\0020\0022\f\020\003\032\b\022\004\022\002H\0010\004H\bø\001\000\002\n\n\b\b\001\022\002\020\001 \001¢\006\002\020\005\002\007\n\005\b20\001¨\006\006"}, d2 = {"synchronized", "T", "Landroidx/collection/internal/Lock;", "block", "Lkotlin/Function0;", "(Landroidx/collection/internal/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "collection"})
/*    */ @SourceDebugExtension({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,27:1\n26#2:28\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n25#1:28\n*E\n"})
/*    */ public final class LockExtKt
/*    */ {
/*    */   public static final <T> T synchronized(@NotNull Lock $this$synchronized, @NotNull Function0 block) {
/* 23 */     Intrinsics.checkNotNullParameter($this$synchronized, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$synchronized = 0;
/*    */     
/* 25 */     Lock this_$iv = $this$synchronized; int $i$f$synchronizedImpl = 0;
/*    */ 
/*    */     
/* 28 */     Lock lock1 = this_$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/collection/internal/Lock}, name=null} */ try { Object object = block.invoke(); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/collection/internal/Lock}, name=null} */ InlineMarker.finallyEnd(1); }  return (T)object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\internal\LockExtKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */