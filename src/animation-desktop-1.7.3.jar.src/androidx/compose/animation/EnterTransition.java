/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\b7\030\000 \0202\0020\001:\001\020B\007\b\004¢\006\002\020\002J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\001H\002J\b\020\n\032\0020\013H\026J\021\020\f\032\0020\0002\006\020\r\032\0020\000H\002J\b\020\016\032\0020\017H\026R\022\020\003\032\0020\004X \004¢\006\006\032\004\b\005\020\006\001\001\021¨\006\022"}, d2 = {"Landroidx/compose/animation/EnterTransition;", "", "()V", "data", "Landroidx/compose/animation/TransitionData;", "getData$animation", "()Landroidx/compose/animation/TransitionData;", "equals", "", "other", "hashCode", "", "plus", "enter", "toString", "", "Companion", "Landroidx/compose/animation/EnterTransitionImpl;", "animation"})
/*     */ @Immutable
/*     */ public abstract class EnterTransition
/*     */ {
/*     */   private EnterTransition() {}
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final EnterTransition plus(@NotNull EnterTransition enter) {
/* 108 */     Intrinsics.checkNotNullParameter(enter, "enter");
/*     */     
/* 110 */     if (enter.getData$animation().getFade() == null) enter.getData$animation().getFade(); 
/* 111 */     if (enter.getData$animation().getSlide() == null) enter.getData$animation().getSlide(); 
/* 112 */     if (enter.getData$animation().getChangeSize() == null) enter.getData$animation().getChangeSize(); 
/* 113 */     if (enter.getData$animation().getScale() == null) enter.getData$animation().getScale();  super((Fade)enter.getData$animation().getChangeSize(), (Slide)getData$animation().getChangeSize(), (ChangeSize)enter.getData$animation().getScale(), getData$animation().getScale(), false, 
/*     */         
/* 115 */         MapsKt.plus(getData$animation().getEffectsMap(), enter.getData$animation().getEffectsMap()), 16, null);
/*     */     super((TransitionData)enter.getData$animation().getSlide());
/*     */     return (EnterTransition)enter.getData$animation().getFade();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/* 124 */     TransitionData $this$toString_u24lambda_u240 = getData$animation(); int $i$a$-run-EnterTransition$toString$1 = 0;
/* 125 */     $this$toString_u24lambda_u240.getFade();
/* 126 */     $this$toString_u24lambda_u240.getSlide(); $this$toString_u24lambda_u240.getChangeSize();
/* 127 */     $this$toString_u24lambda_u240.getScale(); return Intrinsics.areEqual(this, None) ? "EnterTransition.None" : ("EnterTransition: \nFade - " + (($this$toString_u24lambda_u240.getFade() != null) ? $this$toString_u24lambda_u240.getFade().toString() : null) + ",\nSlide - " + (($this$toString_u24lambda_u240.getSlide() != null) ? $this$toString_u24lambda_u240.getSlide().toString() : null) + ",\nShrink - " + (($this$toString_u24lambda_u240.getChangeSize() != null) ? $this$toString_u24lambda_u240.getChangeSize().toString() : null) + ",\nScale - " + (($this$toString_u24lambda_u240.getScale() != null) ? $this$toString_u24lambda_u240.getScale().toString() : null));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 132 */     return (other instanceof EnterTransition && Intrinsics.areEqual(((EnterTransition)other).getData$animation(), getData$animation()));
/*     */   }
/*     */   public int hashCode() {
/* 135 */     return getData$animation().hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/animation/EnterTransition$Companion;", "", "()V", "None", "Landroidx/compose/animation/EnterTransition;", "getNone", "()Landroidx/compose/animation/EnterTransition;", "animation"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final EnterTransition getNone() {
/* 146 */       return EnterTransition.None; } } @NotNull public static final Companion Companion = new Companion(null); public static final int $stable; @NotNull private static final EnterTransition None = new EnterTransitionImpl(new TransitionData(null, null, null, null, false, null, 63, null));
/*     */   
/*     */   @NotNull
/*     */   public abstract TransitionData getData$animation();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\EnterTransition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */