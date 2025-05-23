/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020!\n\000\n\002\020\002\n\002\b\006\n\002\020\b\n\002\b\005\b'\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\r\022\006\020\003\032\0028\000¢\006\002\020\004J\006\020\016\032\0020\017J\025\020\020\032\0020\0172\006\020\021\032\0028\000H\026¢\006\002\020\004J\b\020\022\032\0020\017H$J\b\020\023\032\0020\017H\026J*\020\024\032\0020\017*\b\022\004\022\0028\0000\r2\006\020\025\032\0020\0262\006\020\027\032\0020\0262\006\020\030\032\0020\026H\004J\"\020\031\032\0020\017*\b\022\004\022\0028\0000\r2\006\020\032\032\0020\0262\006\020\030\032\0020\026H\004R&\020\006\032\0028\0002\006\020\005\032\0028\000@TX\016¢\006\020\n\002\020\n\032\004\b\007\020\b\"\004\b\t\020\004R\023\020\003\032\0028\000¢\006\n\n\002\020\n\032\004\b\013\020\bR\024\020\f\032\b\022\004\022\0028\0000\rX\004¢\006\002\n\000¨\006\033"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", "T", "Landroidx/compose/runtime/Applier;", "root", "(Ljava/lang/Object;)V", "<set-?>", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Ljava/lang/Object;", "getRoot", "stack", "", "clear", "", "down", "node", "onClear", "up", "move", "from", "", "to", "count", "remove", "index", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,289:1\n50#2,7:290\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n*L\n206#1:290,7\n*E\n"})
/*     */ public abstract class AbstractApplier<T>
/*     */   implements Applier<T>
/*     */ {
/*     */   private final T root;
/*     */   @NotNull
/*     */   private final List<T> stack;
/*     */   private T current;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public final T getRoot() {
/*     */     return this.root;
/*     */   }
/*     */   
/*     */   public AbstractApplier(Object root) {
/* 195 */     this.root = (T)root;
/* 196 */     this.stack = new ArrayList<>();
/* 197 */     this.current = this.root; } public T getCurrent() { return this.current; } protected void setCurrent(Object <set-?>) {
/* 198 */     this.current = (T)<set-?>;
/*     */   }
/*     */   public void down(Object node) {
/* 201 */     this.stack.add(getCurrent());
/* 202 */     setCurrent((T)node);
/*     */   }
/*     */ 
/*     */   
/*     */   public void up() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield stack : Ljava/util/List;
/*     */     //   4: checkcast java/util/Collection
/*     */     //   7: invokeinterface isEmpty : ()Z
/*     */     //   12: ifne -> 19
/*     */     //   15: iconst_1
/*     */     //   16: goto -> 20
/*     */     //   19: iconst_0
/*     */     //   20: istore_1
/*     */     //   21: nop
/*     */     //   22: iconst_0
/*     */     //   23: istore_2
/*     */     //   24: nop
/*     */     //   25: iload_1
/*     */     //   26: ifne -> 36
/*     */     //   29: iconst_0
/*     */     //   30: istore_3
/*     */     //   31: ldc 'empty stack'
/*     */     //   33: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   36: nop
/*     */     //   37: aload_0
/*     */     //   38: aload_0
/*     */     //   39: getfield stack : Ljava/util/List;
/*     */     //   42: aload_0
/*     */     //   43: getfield stack : Ljava/util/List;
/*     */     //   46: invokeinterface size : ()I
/*     */     //   51: iconst_1
/*     */     //   52: isub
/*     */     //   53: invokeinterface remove : (I)Ljava/lang/Object;
/*     */     //   58: invokevirtual setCurrent : (Ljava/lang/Object;)V
/*     */     //   61: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #206	-> 0
/*     */     //   #206	-> 21
/*     */     //   #290	-> 24
/*     */     //   #293	-> 25
/*     */     //   #294	-> 29
/*     */     //   #206	-> 31
/*     */     //   #294	-> 33
/*     */     //   #296	-> 36
/*     */     //   #207	-> 37
/*     */     //   #208	-> 61
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   31	2	3	$i$a$-checkPrecondition-AbstractApplier$up$1	I
/*     */     //   24	13	2	$i$f$checkPrecondition	I
/*     */     //   22	15	1	value$iv	Z
/*     */     //   0	62	0	this	Landroidx/compose/runtime/AbstractApplier;
/*     */   }
/*     */   
/*     */   public final void clear() {
/* 211 */     this.stack.clear();
/* 212 */     setCurrent(this.root);
/* 213 */     onClear();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract void onClear();
/*     */ 
/*     */   
/*     */   protected final void remove(@NotNull List $this$remove, int index, int count) {
/* 222 */     Intrinsics.checkNotNullParameter($this$remove, "<this>"); if (count == 1) {
/* 223 */       $this$remove.remove(index);
/*     */     } else {
/* 225 */       $this$remove.subList(index, index + count).clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected final void move(@NotNull List<Object> $this$move, int from, int to, int count) {
/* 230 */     Intrinsics.checkNotNullParameter($this$move, "<this>"); int dest = (from > to) ? to : (to - count);
/* 231 */     if (count == 1) {
/* 232 */       if (from == to + 1 || from == to - 1) {
/*     */         
/* 234 */         Object fromEl = $this$move.get(from);
/* 235 */         Object toEl = $this$move.set(to, fromEl);
/* 236 */         $this$move.set(from, toEl);
/*     */       } else {
/* 238 */         Object fromEl = $this$move.remove(from);
/* 239 */         $this$move.add(dest, fromEl);
/*     */       } 
/*     */     } else {
/* 242 */       List subView = $this$move.subList(from, from + count);
/* 243 */       List<?> subCopy = CollectionsKt.toMutableList(subView);
/* 244 */       subView.clear();
/* 245 */       $this$move.addAll(dest, subCopy);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\AbstractApplier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */