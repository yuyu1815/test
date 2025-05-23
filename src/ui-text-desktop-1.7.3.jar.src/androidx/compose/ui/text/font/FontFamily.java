/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.State;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\007\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \t2\0020\001:\002\t\nB\017\b\004\022\006\020\002\032\0020\003¢\006\002\020\004R\031\020\002\032\0020\0038G¢\006\016\n\000\022\004\b\005\020\006\032\004\b\007\020\b\001\003\013\f\r¨\006\016"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "", "canLoadSynchronously", "", "(Z)V", "getCanLoadSynchronously$annotations", "()V", "getCanLoadSynchronously", "()Z", "Companion", "Resolver", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "ui-text"})
/*     */ @Immutable
/*     */ public abstract class FontFamily
/*     */ {
/*     */   private FontFamily(boolean canLoadSynchronously) {
/* 150 */     this.canLoadSynchronously = canLoadSynchronously; } @Deprecated(message = "Unused property that has no meaning. Do not use.", level = DeprecationLevel.ERROR) public final boolean getCanLoadSynchronously() { return this.canLoadSynchronously; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\bv\030\0002\0020\001J\026\020\002\032\0020\0032\006\020\004\032\0020\005H¦@¢\006\002\020\006JB\020\007\032\b\022\004\022\0020\0010\b2\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\016H&ø\001\000¢\006\004\b\017\020\020\001\001\021ø\001\001\002\r\n\005\b¡\0360\001\n\004\b!0\001¨\006\022À\006\001"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Resolver;", "", "preload", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "ui-text"})
/*     */   public static interface Resolver {
/*     */     @Nullable
/*     */     Object preload(@NotNull FontFamily param1FontFamily, @NotNull Continuation<? super Unit> param1Continuation);
/*     */     
/*     */     @NotNull
/*     */     State<Object> resolve-DPcqOEQ(@Nullable FontFamily param1FontFamily, @NotNull FontWeight param1FontWeight, int param1Int1, int param1Int2);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006¨\006\021"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Companion;", "", "()V", "Cursive", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getCursive", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Default", "Landroidx/compose/ui/text/font/SystemFontFamily;", "getDefault", "()Landroidx/compose/ui/text/font/SystemFontFamily;", "Monospace", "getMonospace", "SansSerif", "getSansSerif", "Serif", "getSerif", "ui-text"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final SystemFontFamily getDefault() {
/*     */       return FontFamily.Default;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final GenericFontFamily getSansSerif() {
/*     */       return FontFamily.SansSerif;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final GenericFontFamily getSerif() {
/*     */       return FontFamily.Serif;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final GenericFontFamily getMonospace() {
/*     */       return FontFamily.Monospace;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final GenericFontFamily getCursive() {
/*     */       return FontFamily.Cursive;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final boolean canLoadSynchronously;
/*     */   public static final int $stable;
/*     */   @NotNull
/*     */   private static final SystemFontFamily Default = new DefaultFontFamily();
/*     */   @NotNull
/*     */   private static final GenericFontFamily SansSerif = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
/*     */   @NotNull
/*     */   private static final GenericFontFamily Serif = new GenericFontFamily("serif", "FontFamily.Serif");
/*     */   @NotNull
/*     */   private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
/*     */   @NotNull
/*     */   private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontFamily.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */