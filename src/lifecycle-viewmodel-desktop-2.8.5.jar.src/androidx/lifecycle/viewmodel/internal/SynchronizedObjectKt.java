/*    */ package androidx.lifecycle.viewmodel.internal;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\022\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032<\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\0032\016\b\004\020\004\032\b\022\004\022\002H\0010\005H\bø\001\000\002\n\n\b\b\001\022\002\020\002 \001¢\006\002\020\006\002\007\n\005\b20\001¨\006\007"}, d2 = {"synchronized", "T", "lock", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "action", "Lkotlin/Function0;", "(Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lifecycle-viewmodel"})
/*    */ @SourceDebugExtension({"SMAP\nSynchronizedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 2 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,57:1\n23#2:58\n*S KotlinDebug\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n*L\n37#1:58\n*E\n"})
/*    */ public final class SynchronizedObjectKt
/*    */ {
/*    */   public static final <T> T synchronized(@NotNull SynchronizedObject lock, @NotNull Function0 action) {
/* 36 */     Intrinsics.checkNotNullParameter(lock, "lock"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$synchronized = 0;
/* 37 */     int $i$f$synchronizedImpl = 0;
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
/* 58 */     SynchronizedObject synchronizedObject = lock; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/lifecycle/viewmodel/internal/SynchronizedObject}, name=null} */ try { Object object = action.invoke(); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/lifecycle/viewmodel/internal/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  return (T)object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\internal\SynchronizedObjectKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */