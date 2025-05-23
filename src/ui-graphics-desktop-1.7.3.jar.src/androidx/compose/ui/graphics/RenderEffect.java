/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.ImageFilter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001B\007\b\004¢\006\002\020\002J\006\020\005\032\0020\004J\b\020\006\032\0020\004H$J\b\020\007\032\0020\bH\026R\020\020\003\032\004\030\0010\004X\016¢\006\002\n\000\001\003\t\n\013¨\006\f"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffect;", "", "()V", "internalImageFilter", "Lorg/jetbrains/skia/ImageFilter;", "asSkiaImageFilter", "createImageFilter", "isSupported", "", "Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/SkiaBackedRenderEffect;", "ui-graphics"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nSkiaBackedRenderEffect.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaBackedRenderEffect.skiko.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
/*     */ public abstract class RenderEffect
/*     */ {
/*     */   @Nullable
/*     */   private ImageFilter internalImageFilter;
/*     */   
/*     */   private RenderEffect() {}
/*     */   
/*     */   @NotNull
/*     */   public final ImageFilter asSkiaImageFilter() {
/*  40 */     if (this.internalImageFilter == null) { ImageFilter imageFilter1 = createImageFilter(), it = imageFilter1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 154 */       int $i$a$-also-RenderEffect$asSkiaImageFilter$1 = 0;
/*     */       this.internalImageFilter = it; }
/*     */     
/*     */     return imageFilter1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected abstract ImageFilter createImageFilter();
/*     */   
/*     */   public boolean isSupported() {
/*     */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\RenderEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */