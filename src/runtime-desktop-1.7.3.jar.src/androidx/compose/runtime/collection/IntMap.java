/*     */ package androidx.compose.runtime.collection;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020%\n\002\b\004\n\002\020\002\n\000\n\002\020\013\n\002\b\n\b\000\030\000*\004\b\000\020\0012\0020\002B\017\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\006\020\013\032\0020\fJ\021\020\r\032\0020\0162\006\020\017\032\0020\004H\002J\030\020\020\032\004\030\0018\0002\006\020\017\032\0020\004H\002¢\006\002\020\021J\033\020\020\032\0028\0002\006\020\017\032\0020\0042\006\020\022\032\0028\000¢\006\002\020\023J\016\020\024\032\0020\f2\006\020\017\032\0020\004J\036\020\025\032\0020\f2\006\020\017\032\0020\0042\006\020\026\032\0028\000H\002¢\006\002\020\027R\032\020\006\032\016\022\004\022\0020\004\022\004\022\0028\0000\007X\004¢\006\002\n\000R\021\020\b\032\0020\0048F¢\006\006\032\004\b\t\020\n¨\006\030"}, d2 = {"Landroidx/compose/runtime/collection/IntMap;", "E", "", "initialCapacity", "", "(I)V", "backingMap", "", "size", "getSize", "()I", "clear", "", "contains", "", "key", "get", "(I)Ljava/lang/Object;", "valueIfAbsent", "(ILjava/lang/Object;)Ljava/lang/Object;", "remove", "set", "value", "(ILjava/lang/Object;)V", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nActualIntMap.desktop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualIntMap.desktop.kt\nandroidx/compose/runtime/collection/IntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
/*     */ public final class IntMap<E>
/*     */ {
/*     */   public IntMap(int initialCapacity) {}
/*     */   
/*     */   @NotNull
/*  30 */   private final Map<Integer, E> backingMap = new LinkedHashMap<>();
/*     */   
/*     */   public static final int $stable = 8;
/*     */ 
/*     */   
/*     */   public final boolean contains(int key) {
/*  36 */     return this.backingMap.containsKey(Integer.valueOf(key));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final E get(int key) {
/*  43 */     return this.backingMap.get(Integer.valueOf(key));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final E get(int key, Object valueIfAbsent) {
/*  50 */     Map<Integer, E> map = this.backingMap; if (map.get(Integer.valueOf(key)) == null) { map.get(Integer.valueOf(key));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 132 */       int $i$a$-getOrElse-IntMap$get$1 = 0; }
/*     */     
/*     */     return (E)valueIfAbsent;
/*     */   }
/*     */   
/*     */   public final void set(int key, Object value) {
/*     */     Integer integer = Integer.valueOf(key);
/*     */     this.backingMap.put(integer, (E)value);
/*     */   }
/*     */   
/*     */   public final void remove(int key) {
/*     */     this.backingMap.remove(Integer.valueOf(key));
/*     */   }
/*     */   
/*     */   public final void clear() {
/*     */     this.backingMap.clear();
/*     */   }
/*     */   
/*     */   public final int getSize() {
/*     */     return this.backingMap.size();
/*     */   }
/*     */   
/*     */   public IntMap() {
/*     */     this(0, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\collection\IntMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */