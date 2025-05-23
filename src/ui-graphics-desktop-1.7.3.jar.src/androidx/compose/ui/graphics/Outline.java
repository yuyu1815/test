/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.RoundRect;
/*     */ import androidx.compose.ui.geometry.RoundRectKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\003\007\b\tB\007\b\004¢\006\002\020\002R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006\001\003\n\013\f¨\006\r"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "", "()V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "Generic", "Rectangle", "Rounded", "Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "ui-graphics"})
/*     */ public abstract class Outline
/*     */ {
/*     */   private Outline() {}
/*     */   
/*     */   @NotNull
/*     */   public abstract Rect getBounds();
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\002J\b\020\r\032\0020\016H\026R\024\020\005\032\0020\0038VX\004¢\006\006\032\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\007¨\006\017"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline;", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;)V", "bounds", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "getRect", "equals", "", "other", "", "hashCode", "", "ui-graphics"})
/*     */   @Immutable
/*     */   public static final class Rectangle
/*     */     extends Outline
/*     */   {
/*     */     @NotNull
/*     */     private final Rect rect;
/*     */     
/*     */     public Rectangle(@NotNull Rect rect) {
/*  43 */       super(null); this.rect = rect; } @NotNull public final Rect getRect() { return this.rect; }
/*     */      @NotNull
/*     */     public Rect getBounds() {
/*  46 */       return this.rect;
/*     */     }
/*     */     public boolean equals(@Nullable Object other) {
/*  49 */       if (this == other) return true; 
/*  50 */       if (!(other instanceof Rectangle)) return false;
/*     */       
/*  52 */       if (!Intrinsics.areEqual(this.rect, ((Rectangle)other).rect)) return false;
/*     */       
/*  54 */       return true;
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*  58 */       return this.rect.hashCode();
/*     */     } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022H\002J\b\020\023\032\0020\024H\026R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\026\020\013\032\004\030\0010\fX\004¢\006\b\n\000\032\004\b\r\020\016¨\006\025"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline;", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "(Landroidx/compose/ui/geometry/RoundRect;)V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "getRoundRect", "()Landroidx/compose/ui/geometry/RoundRect;", "roundRectPath", "Landroidx/compose/ui/graphics/Path;", "getRoundRectPath$ui_graphics", "()Landroidx/compose/ui/graphics/Path;", "equals", "", "other", "", "hashCode", "", "ui-graphics"})
/*     */   @Immutable
/*     */   @SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
/*     */   public static final class Rounded extends Outline { @NotNull
/*     */     private final RoundRect roundRect;
/*     */     public Rounded(@NotNull RoundRect roundRect) {
/*  65 */       super(null); this.roundRect = roundRect;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  77 */       Path path1 = SkiaBackedPath_skikoKt.Path(), path2 = path1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 298 */       Rounded rounded = this; int $i$a$-apply-Outline$Rounded$1 = 0;
/*     */       Path.addRoundRect$default(path2, this.roundRect, null, 2, null);
/*     */       rounded.roundRectPath = !RoundRectKt.isSimple(this.roundRect) ? path1 : null;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private final Path roundRectPath;
/*     */     
/*     */     @NotNull
/*     */     public final RoundRect getRoundRect() {
/*     */       return this.roundRect;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Path getRoundRectPath$ui_graphics() {
/*     */       return this.roundRectPath;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Rect getBounds() {
/*     */       return RoundRectKt.getBoundingRect(this.roundRect);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Rounded))
/*     */         return false; 
/*     */       if (!Intrinsics.areEqual(this.roundRect, ((Rounded)other).roundRect))
/*     */         return false; 
/*     */       return true;
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.roundRect.hashCode();
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline;", "path", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "ui-graphics"})
/*     */   public static final class Generic extends Outline {
/*     */     @NotNull
/*     */     private final Path path;
/*     */     
/*     */     public Generic(@NotNull Path path) {
/*     */       super(null);
/*     */       this.path = path;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Path getPath() {
/*     */       return this.path;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Rect getBounds() {
/*     */       return this.path.getBounds();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Outline.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */