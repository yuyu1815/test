/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.layout.ContentScale;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0322\0020\001:\001\032B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\005HÆ\003J\035\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\031HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\030\020\013\032\006\022\002\b\0030\f8PX\004¢\006\006\032\004\b\r\020\016¨\006\033"}, d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect;", "Landroidx/compose/animation/TransitionEffect;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "key", "Landroidx/compose/animation/TransitionEffectKey;", "getKey$animation", "()Landroidx/compose/animation/TransitionEffectKey;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Key", "animation"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class ContentScaleTransitionEffect
/*     */   extends TransitionEffect
/*     */ {
/*     */   @NotNull
/*     */   public static final Key Key = new Key(null);
/*     */   @NotNull
/*     */   private final ContentScale contentScale;
/*     */   @NotNull
/*     */   private final Alignment alignment;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public final ContentScale getContentScale() {
/* 257 */     return this.contentScale; } @NotNull
/* 258 */   public final Alignment getAlignment() { return this.alignment; }
/* 259 */   public ContentScaleTransitionEffect(@NotNull ContentScale contentScale, @NotNull Alignment alignment) { super(null);
/*     */     this.contentScale = contentScale;
/*     */     this.alignment = alignment; }
/*     */    @NotNull
/*     */   public TransitionEffectKey<?> getKey$animation() {
/* 264 */     return Key;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect$Key;", "Landroidx/compose/animation/TransitionEffectKey;", "Landroidx/compose/animation/ContentScaleTransitionEffect;", "()V", "animation"})
/*     */   public static final class Key implements TransitionEffectKey<ContentScaleTransitionEffect> {
/*     */     private Key() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ContentScale component1() {
/*     */     return this.contentScale;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Alignment component2() {
/*     */     return this.alignment;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ContentScaleTransitionEffect copy(@NotNull ContentScale contentScale, @NotNull Alignment alignment) {
/*     */     Intrinsics.checkNotNullParameter(contentScale, "contentScale");
/*     */     Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */     return new ContentScaleTransitionEffect(contentScale, alignment);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ContentScaleTransitionEffect(contentScale=" + this.contentScale + ", alignment=" + this.alignment + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.contentScale.hashCode();
/*     */     return result * 31 + this.alignment.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ContentScaleTransitionEffect))
/*     */       return false; 
/*     */     ContentScaleTransitionEffect contentScaleTransitionEffect = (ContentScaleTransitionEffect)other;
/*     */     return !Intrinsics.areEqual(this.contentScale, contentScaleTransitionEffect.contentScale) ? false : (!!Intrinsics.areEqual(this.alignment, contentScaleTransitionEffect.alignment));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\ContentScaleTransitionEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */