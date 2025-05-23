/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.text.intl.LocaleList;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\027\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\007\030\000 +2\0020\001:\001+BE\b\027\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f¢\006\002\020\rB9\b\027\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\n¢\006\002\020\016BM\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f\022\b\b\002\020\017\032\0020\020¢\006\002\020\021JD\020\036\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\nH\007ø\001\000¢\006\004\b\037\020 JP\020\036\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\fH\007ø\001\000¢\006\004\b!\020\"JX\020\036\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\b\b\002\020\017\032\0020\020ø\001\000¢\006\004\b#\020$J\023\020%\032\0020\0032\b\020&\032\004\030\0010\001H\002J\b\020'\032\0020(H\026J\b\020)\032\0020*H\026R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\022\020\023R\031\020\004\032\0020\005ø\001\000ø\001\001¢\006\n\n\002\020\026\032\004\b\024\020\025R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\027\020\030R\031\020\t\032\0020\nø\001\000ø\001\001¢\006\n\n\002\020\026\032\004\b\031\020\025R\031\020\007\032\0020\bø\001\000ø\001\001¢\006\n\n\002\020\026\032\004\b\032\020\025R\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\033\020\034R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\035\020\023\002\013\n\005\b¡\0360\001\n\002\b!¨\006,"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "singleLine", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "autoCorrect", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "platformImeOptions", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ZIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "hintLocales", "Landroidx/compose/ui/text/intl/LocaleList;", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoCorrect", "()Z", "getCapitalization-IUNYP9k", "()I", "I", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "getImeAction-eUduSuo", "getKeyboardType-PjHm6EE", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "getSingleLine", "copy", "copy-uxg59PA", "(ZIZII)Landroidx/compose/ui/text/input/ImeOptions;", "copy-YTHSh70", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/ui/text/input/ImeOptions;", "copy-wBHncE4", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/ui/text/input/ImeOptions;", "equals", "other", "hashCode", "", "toString", "", "Companion", "ui-text"})
/*     */ @Immutable
/*     */ public final class ImeOptions
/*     */ {
/*     */   public final boolean getSingleLine() {
/*     */     return this.singleLine;
/*     */   }
/*     */   
/*     */   public final int getCapitalization-IUNYP9k() {
/*     */     return this.capitalization;
/*     */   }
/*     */   
/*     */   public final boolean getAutoCorrect() {
/*     */     return this.autoCorrect;
/*     */   }
/*     */   
/*     */   public final int getKeyboardType-PjHm6EE() {
/*     */     return this.keyboardType;
/*     */   }
/*     */   
/*     */   public final int getImeAction-eUduSuo() {
/*     */     return this.imeAction;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final PlatformImeOptions getPlatformImeOptions() {
/*     */     return this.platformImeOptions;
/*     */   }
/*     */   
/*     */   private ImeOptions(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, LocaleList hintLocales) {
/*  50 */     this.singleLine = singleLine;
/*  51 */     this.capitalization = capitalization;
/*  52 */     this.autoCorrect = autoCorrect;
/*  53 */     this.keyboardType = keyboardType;
/*  54 */     this.imeAction = imeAction;
/*  55 */     this.platformImeOptions = platformImeOptions;
/*  56 */     this.hintLocales = hintLocales; } @NotNull public final LocaleList getHintLocales() { return this.hintLocales; }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/input/ImeOptions;", "getDefault", "()Landroidx/compose/ui/text/input/ImeOptions;", "ui-text"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @NotNull
/*  62 */     public final ImeOptions getDefault() { return ImeOptions.Default; } } @NotNull public static final Companion Companion = new Companion(null); private final boolean singleLine; private final int capitalization; @NotNull private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);
/*     */   
/*     */   private final boolean autoCorrect;
/*     */   
/*     */   private final int keyboardType;
/*     */   
/*     */   private final int imeAction;
/*     */   @Nullable
/*     */   private final PlatformImeOptions platformImeOptions;
/*     */   @NotNull
/*     */   private final LocaleList hintLocales;
/*     */   public static final int $stable;
/*     */   
/*     */   private ImeOptions(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions) {
/*  76 */     this(
/*  77 */         singleLine, 
/*  78 */         capitalization, 
/*  79 */         autoCorrect, 
/*  80 */         keyboardType, 
/*  81 */         imeAction, 
/*  82 */         platformImeOptions, 
/*  83 */         LocaleList.Companion.getEmpty(), (DefaultConstructorMarker)null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ImeOptions(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
/*  96 */     this(
/*  97 */         singleLine, 
/*  98 */         capitalization, 
/*  99 */         autoCorrect, 
/* 100 */         keyboardType, 
/* 101 */         imeAction, 
/* 102 */         null, null, 64, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ImeOptions copy-wBHncE4(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, @Nullable PlatformImeOptions platformImeOptions, @NotNull LocaleList hintLocales) {
/* 114 */     Intrinsics.checkNotNullParameter(hintLocales, "hintLocales"); return new ImeOptions(
/* 115 */         singleLine, 
/* 116 */         capitalization, 
/* 117 */         autoCorrect, 
/* 118 */         keyboardType, 
/* 119 */         imeAction, 
/* 120 */         platformImeOptions, 
/* 121 */         hintLocales, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 171 */     if (this == other) return true; 
/* 172 */     if (!(other instanceof ImeOptions)) return false;
/*     */     
/* 174 */     if (this.singleLine != ((ImeOptions)other).singleLine) return false; 
/* 175 */     if (!KeyboardCapitalization.equals-impl0(this.capitalization, ((ImeOptions)other).capitalization)) return false; 
/* 176 */     if (this.autoCorrect != ((ImeOptions)other).autoCorrect) return false; 
/* 177 */     if (!KeyboardType.equals-impl0(this.keyboardType, ((ImeOptions)other).keyboardType)) return false; 
/* 178 */     if (!ImeAction.equals-impl0(this.imeAction, ((ImeOptions)other).imeAction)) return false; 
/* 179 */     if (!Intrinsics.areEqual(this.platformImeOptions, ((ImeOptions)other).platformImeOptions)) return false; 
/* 180 */     if (!Intrinsics.areEqual(this.hintLocales, ((ImeOptions)other).hintLocales)) return false;
/*     */     
/* 182 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 186 */     int result = Boolean.hashCode(this.singleLine);
/* 187 */     result = 31 * result + KeyboardCapitalization.hashCode-impl(this.capitalization);
/* 188 */     result = 31 * result + Boolean.hashCode(this.autoCorrect);
/* 189 */     result = 31 * result + KeyboardType.hashCode-impl(this.keyboardType);
/* 190 */     result = 31 * result + ImeAction.hashCode-impl(this.imeAction);
/* 191 */     result = 31 * result + ((this.platformImeOptions != null) ? this.platformImeOptions.hashCode() : 0);
/* 192 */     result = 31 * result + this.hintLocales.hashCode();
/* 193 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 197 */     return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + KeyboardCapitalization.toString-impl(this.capitalization) + ", autoCorrect=" + 
/* 198 */       this.autoCorrect + ", keyboardType=" + KeyboardType.toString-impl(this.keyboardType) + ", imeAction=" + ImeAction.toString-impl(this.imeAction) + ", platformImeOptions=" + 
/* 199 */       this.platformImeOptions + ", hintLocales=" + this.hintLocales + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\ImeOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */