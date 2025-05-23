/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\004\n\002\030\002\n\002\030\002\n\000\bp\030\0002\b\022\004\022\0020\0020\001:\002\007\bR\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006\001\002\t\nø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "cacheable", "", "getCacheable", "()Z", "Async", "Immutable", "Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "ui-text"})
/*     */ public interface TypefaceResult
/*     */   extends State<Object>
/*     */ {
/*     */   boolean getCacheable();
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\013\n\002\b\006\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "Landroidx/compose/ui/text/font/TypefaceResult;", "value", "", "cacheable", "", "(Ljava/lang/Object;Z)V", "getCacheable", "()Z", "getValue", "()Ljava/lang/Object;", "ui-text"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Immutable
/*     */     implements TypefaceResult
/*     */   {
/*     */     @NotNull
/*     */     private final Object value;
/*     */     private final boolean cacheable;
/*     */     public static final int $stable;
/*     */     
/*     */     @NotNull
/*     */     public Object getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public Immutable(@NotNull Object value, boolean cacheable) {
/* 153 */       this.value = value;
/* 154 */       this.cacheable = cacheable; } public boolean getCacheable() { return this.cacheable; } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\b\b\007\030\0002\0020\0012\b\022\004\022\0020\0030\002B\r\022\006\020\004\032\0020\005¢\006\002\020\006R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\013\020\fR\022\020\r\032\0020\003X\005¢\006\006\032\004\b\016\020\017¨\006\020"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "current", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "(Landroidx/compose/ui/text/font/AsyncFontListLoader;)V", "cacheable", "", "getCacheable", "()Z", "getCurrent$ui_text", "()Landroidx/compose/ui/text/font/AsyncFontListLoader;", "value", "getValue", "()Ljava/lang/Object;", "ui-text"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Async implements TypefaceResult, State<Object> { @NotNull
/* 157 */     private final AsyncFontListLoader current; public Async(@NotNull AsyncFontListLoader current) { this.current = current; } public static final int $stable; @NotNull public final AsyncFontListLoader getCurrent$ui_text() { return this.current; } @NotNull
/*     */     public Object getValue() { return this.current.getValue(); }
/* 159 */     public boolean getCacheable() { return this.current.getCacheable$ui_text(); }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\TypefaceResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */