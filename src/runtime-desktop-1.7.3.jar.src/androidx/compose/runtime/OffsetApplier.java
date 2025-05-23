/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\006\n\002\020\002\n\002\b\017\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\033\022\f\020\003\032\b\022\004\022\0028\0000\002\022\006\020\004\032\0020\005¢\006\002\020\006J\b\020\013\032\0020\fH\026J\025\020\r\032\0020\f2\006\020\016\032\0028\000H\026¢\006\002\020\017J\035\020\020\032\0020\f2\006\020\021\032\0020\0052\006\020\022\032\0028\000H\026¢\006\002\020\023J\035\020\024\032\0020\f2\006\020\021\032\0020\0052\006\020\022\032\0028\000H\026¢\006\002\020\023J \020\025\032\0020\f2\006\020\026\032\0020\0052\006\020\027\032\0020\0052\006\020\030\032\0020\005H\026J\030\020\031\032\0020\f2\006\020\021\032\0020\0052\006\020\030\032\0020\005H\026J\b\020\032\032\0020\fH\026R\024\020\003\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000R\024\020\007\032\0028\0008VX\004¢\006\006\032\004\b\b\020\tR\016\020\n\032\0020\005X\016¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\033"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "applier", "offset", "", "(Landroidx/compose/runtime/Applier;I)V", "current", "getCurrent", "()Ljava/lang/Object;", "nesting", "clear", "", "down", "node", "(Ljava/lang/Object;)V", "insertBottomUp", "index", "instance", "(ILjava/lang/Object;)V", "insertTopDown", "move", "from", "to", "count", "remove", "up", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n4553#2,7:290\n4553#2,7:297\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:290,7\n286#1:297,7\n*E\n"})
/*     */ public final class OffsetApplier<N>
/*     */   implements Applier<N>
/*     */ {
/*     */   @NotNull
/*     */   private final Applier<N> applier;
/*     */   private final int offset;
/*     */   private int nesting;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public OffsetApplier(@NotNull Applier<N> applier, int offset) {
/* 251 */     this.applier = applier;
/* 252 */     this.offset = offset;
/*     */   }
/*     */   public N getCurrent() {
/* 255 */     return this.applier.getCurrent();
/*     */   }
/*     */   public void down(Object node) {
/* 258 */     int i = this.nesting; this.nesting = i + 1;
/* 259 */     this.applier.down((N)node);
/*     */   }
/*     */ 
/*     */   
/*     */   public void up() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield nesting : I
/*     */     //   4: ifle -> 11
/*     */     //   7: iconst_1
/*     */     //   8: goto -> 12
/*     */     //   11: iconst_0
/*     */     //   12: istore_1
/*     */     //   13: iconst_0
/*     */     //   14: istore_2
/*     */     //   15: nop
/*     */     //   16: iload_1
/*     */     //   17: ifne -> 27
/*     */     //   20: iconst_0
/*     */     //   21: istore_3
/*     */     //   22: ldc 'OffsetApplier up called with no corresponding down'
/*     */     //   24: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*     */     //   27: nop
/*     */     //   28: aload_0
/*     */     //   29: getfield nesting : I
/*     */     //   32: istore_1
/*     */     //   33: aload_0
/*     */     //   34: iload_1
/*     */     //   35: iconst_m1
/*     */     //   36: iadd
/*     */     //   37: putfield nesting : I
/*     */     //   40: aload_0
/*     */     //   41: getfield applier : Landroidx/compose/runtime/Applier;
/*     */     //   44: invokeinterface up : ()V
/*     */     //   49: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #263	-> 0
/*     */     //   #290	-> 15
/*     */     //   #293	-> 16
/*     */     //   #294	-> 20
/*     */     //   #263	-> 22
/*     */     //   #294	-> 24
/*     */     //   #296	-> 27
/*     */     //   #264	-> 28
/*     */     //   #265	-> 40
/*     */     //   #266	-> 49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   22	2	3	$i$a$-runtimeCheck-OffsetApplier$up$1	I
/*     */     //   15	13	2	$i$f$runtimeCheck	I
/*     */     //   13	15	1	value$iv	Z
/*     */     //   0	50	0	this	Landroidx/compose/runtime/OffsetApplier;
/*     */   }
/*     */ 
/*     */   
/*     */   public void insertTopDown(int index, Object instance) {
/* 269 */     this.applier.insertTopDown(index + ((this.nesting == 0) ? this.offset : 0), (N)instance);
/*     */   }
/*     */   
/*     */   public void insertBottomUp(int index, Object instance) {
/* 273 */     this.applier.insertBottomUp(index + ((this.nesting == 0) ? this.offset : 0), (N)instance);
/*     */   }
/*     */   
/*     */   public void remove(int index, int count) {
/* 277 */     this.applier.remove(index + ((this.nesting == 0) ? this.offset : 0), count);
/*     */   }
/*     */   
/*     */   public void move(int from, int to, int count) {
/* 281 */     int effectiveOffset = (this.nesting == 0) ? this.offset : 0;
/* 282 */     this.applier.move(from + effectiveOffset, to + effectiveOffset, count);
/*     */   }
/*     */   
/*     */   public void clear() {
/* 286 */     boolean value$iv = false; int $i$f$runtimeCheck = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 301 */     int $i$a$-runtimeCheck-OffsetApplier$clear$1 = 0; ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\OffsetApplier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */