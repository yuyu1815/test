/*    */ package androidx.compose.runtime.snapshots;
/*    */ 
/*    */ import androidx.compose.runtime.AtomicInt;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\b \030\0002\0020\001B\007\b\000¢\006\002\020\002J\032\020\005\032\0020\0062\006\020\007\032\0020\bH\000ø\001\000¢\006\004\b\t\020\nJ\032\020\013\032\0020\f2\006\020\007\032\0020\bH\000ø\001\000¢\006\004\b\r\020\016R\016\020\003\032\0020\004X\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006\017"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/StateObject;", "()V", "readerKind", "Landroidx/compose/runtime/AtomicInt;", "isReadIn", "", "reader", "Landroidx/compose/runtime/snapshots/ReaderKind;", "isReadIn-h_f27i8$runtime", "(I)Z", "recordReadIn", "", "recordReadIn-h_f27i8$runtime", "(I)V", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nStateObjectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind\n*L\n1#1,56:1\n48#2:57\n46#2:58\n48#2:59\n*S KotlinDebug\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n*L\n33#1:57\n35#1:58\n40#1:59\n*E\n"})
/*    */ public abstract class StateObjectImpl
/*    */   implements StateObject
/*    */ {
/*    */   @NotNull
/* 29 */   private final AtomicInt readerKind = new AtomicInt(0); public static final int $stable = 8; public final void recordReadIn-h_f27i8$runtime(int reader) { int old;
/*    */     int new;
/*    */     do {
/* 32 */       old = ReaderKind.constructor-impl(this.readerKind.get());
/* 33 */       int $i$f$isReadIn-h_f27i8 = 0;
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
/*    */       
/* 57 */       if (((old & reader) != 0))
/* 58 */         return;  int $i$f$withReadIn-3QSx2Dw = 0; new = ReaderKind.constructor-impl(old | reader);
/* 59 */     } while (!this.readerKind.compareAndSet(old, new)); } public final boolean isReadIn-h_f27i8$runtime(int reader) { int arg0$iv = ReaderKind.constructor-impl(this.readerKind.get()), $i$f$isReadIn-h_f27i8 = 0; return ((arg0$iv & reader) != 0); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\StateObjectImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */