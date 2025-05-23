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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\b7\030\000 \0202\0020\001:\001\020B\007\b\004¢\006\002\020\002J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\001H\002J\b\020\n\032\0020\013H\026J\021\020\f\032\0020\0002\006\020\r\032\0020\000H\002J\b\020\016\032\0020\017H\026R\022\020\003\032\0020\004X \004¢\006\006\032\004\b\005\020\006\001\001\021¨\006\022"}, d2 = {"Landroidx/compose/animation/ExitTransition;", "", "()V", "data", "Landroidx/compose/animation/TransitionData;", "getData$animation", "()Landroidx/compose/animation/TransitionData;", "equals", "", "other", "hashCode", "", "plus", "exit", "toString", "", "Companion", "Landroidx/compose/animation/ExitTransitionImpl;", "animation"})
/*     */ @Immutable
/*     */ public abstract class ExitTransition
/*     */ {
/*     */   private ExitTransition() {}
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final ExitTransition plus(@NotNull ExitTransition exit) {
/* 194 */     Intrinsics.checkNotNullParameter(exit, "exit");
/*     */     
/* 196 */     if (exit.getData$animation().getFade() == null) exit.getData$animation().getFade(); 
/* 197 */     if (exit.getData$animation().getSlide() == null) exit.getData$animation().getSlide(); 
/* 198 */     if (exit.getData$animation().getChangeSize() == null) exit.getData$animation().getChangeSize(); 
/* 199 */     if (exit.getData$animation().getScale() == null) exit.getData$animation().getScale();  super((Fade)exit.getData$animation().getChangeSize(), (Slide)getData$animation().getChangeSize(), (ChangeSize)exit.getData$animation().getScale(), getData$animation().getScale(), 
/* 200 */         (exit.getData$animation().getHold() || getData$animation().getHold()), 
/*     */         
/* 202 */         MapsKt.plus(getData$animation().getEffectsMap(), exit.getData$animation().getEffectsMap()));
/*     */     super((TransitionData)exit.getData$animation().getSlide());
/*     */     return (ExitTransition)exit.getData$animation().getFade();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 208 */     return (other instanceof ExitTransition && Intrinsics.areEqual(((ExitTransition)other).getData$animation(), getData$animation()));
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 212 */     ExitTransition exitTransition = this;
/*     */ 
/*     */     
/* 215 */     TransitionData $this$toString_u24lambda_u240 = getData$animation(); int $i$a$-run-ExitTransition$toString$1 = 0;
/* 216 */     $this$toString_u24lambda_u240.getFade();
/* 217 */     $this$toString_u24lambda_u240.getSlide(); $this$toString_u24lambda_u240.getChangeSize();
/* 218 */     $this$toString_u24lambda_u240.getScale(); return Intrinsics.areEqual(exitTransition, None) ? "ExitTransition.None" : (Intrinsics.areEqual(exitTransition, KeepUntilTransitionsFinished) ? "ExitTransition.KeepUntilTransitionsFinished" : ("ExitTransition: \nFade - " + (($this$toString_u24lambda_u240.getFade() != null) ? $this$toString_u24lambda_u240.getFade().toString() : null) + ",\nSlide - " + (($this$toString_u24lambda_u240.getSlide() != null) ? $this$toString_u24lambda_u240.getSlide().toString() : null) + ",\nShrink - " + (($this$toString_u24lambda_u240.getChangeSize() != null) ? $this$toString_u24lambda_u240.getChangeSize().toString() : null) + ",\nScale - " + (($this$toString_u24lambda_u240.getScale() != null) ? $this$toString_u24lambda_u240.getScale().toString() : null) + 
/* 219 */       ",\nKeepUntilTransitionsFinished - " + $this$toString_u24lambda_u240.getHold()));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 223 */     return getData$animation().hashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "()V", "KeepUntilTransitionsFinished", "Landroidx/compose/animation/ExitTransition;", "getKeepUntilTransitionsFinished$animation", "()Landroidx/compose/animation/ExitTransition;", "None", "getNone", "animation"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final ExitTransition getNone() {
/* 237 */       return ExitTransition.None;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final ExitTransition getKeepUntilTransitionsFinished$animation()
/*     */     {
/* 245 */       return ExitTransition.KeepUntilTransitionsFinished; } } @NotNull
/* 246 */   private static final ExitTransition KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(null, null, null, null, true, null, 47, null));
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   public static final int $stable;
/*     */   @NotNull
/*     */   private static final ExitTransition None = new ExitTransitionImpl(new TransitionData(null, null, null, null, false, null, 63, null));
/*     */   
/*     */   @NotNull
/*     */   public abstract TransitionData getData$animation();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\ExitTransition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */