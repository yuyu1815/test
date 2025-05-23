/*     */ package androidx.compose.runtime.tooling;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\034\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\f\n\002\020\016\n\002\b\003\bf\030\0002\0020\001R\032\020\002\032\n\022\006\022\004\030\0010\0040\003X¦\004¢\006\006\032\004\b\005\020\006R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nR\026\020\013\032\004\030\0010\0048VX\004¢\006\006\032\004\b\f\020\rR\022\020\016\032\0020\004X¦\004¢\006\006\032\004\b\017\020\rR\024\020\020\032\004\030\0010\004X¦\004¢\006\006\032\004\b\021\020\rR\024\020\022\032\0020\b8VX\004¢\006\006\032\004\b\023\020\nR\024\020\024\032\004\030\0010\025X¦\004¢\006\006\032\004\b\026\020\027ø\001\000\002\006\n\004\b!0\001¨\006\030À\006\003"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/tooling/CompositionData;", "data", "", "", "getData", "()Ljava/lang/Iterable;", "groupSize", "", "getGroupSize", "()I", "identity", "getIdentity", "()Ljava/lang/Object;", "key", "getKey", "node", "getNode", "slotsSize", "getSlotsSize", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "runtime"})
/*     */ public interface CompositionGroup
/*     */   extends CompositionData
/*     */ {
/*     */   @Nullable
/*     */   default Object getIdentity() {
/*  94 */     return null; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated @Nullable public static Object getIdentity(@NotNull CompositionGroup $this) { return $this.getIdentity(); }
/*     */     @Deprecated
/*     */     @Nullable
/*     */     public static CompositionGroup find(@NotNull CompositionGroup $this, @NotNull Object identityToFind) { Intrinsics.checkNotNullParameter(identityToFind, "identityToFind");
/*     */       return $this.find(identityToFind); } @Deprecated
/*  99 */     public static int getGroupSize(@NotNull CompositionGroup $this) { return $this.getGroupSize(); }
/*     */      @Deprecated
/* 101 */     public static int getSlotsSize(@NotNull CompositionGroup $this) { return $this.getSlotsSize(); } } default int getGroupSize() { return 0; } default int getSlotsSize() { return 0; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   Object getKey();
/*     */   
/*     */   @Nullable
/*     */   String getSourceInfo();
/*     */   
/*     */   @Nullable
/*     */   Object getNode();
/*     */   
/*     */   @NotNull
/*     */   Iterable<Object> getData();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\tooling\CompositionGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */