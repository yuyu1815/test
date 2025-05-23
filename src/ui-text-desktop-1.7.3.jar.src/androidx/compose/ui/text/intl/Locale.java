/*    */ package androidx.compose.ui.text.intl;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\004\b\007\030\000 \0312\0020\001:\001\031B\017\b\026\022\006\020\002\032\0020\003¢\006\002\020\004B\023\b\000\022\n\020\005\032\0060\006j\002`\007¢\006\002\020\bJ\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001H\002J\b\020\025\032\0020\026H\026J\006\020\027\032\0020\003J\b\020\030\032\0020\003H\026R\021\020\t\032\0020\0038F¢\006\006\032\004\b\n\020\013R\025\020\005\032\0060\006j\002`\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\016\032\0020\0038F¢\006\006\032\004\b\017\020\013R\021\020\020\032\0020\0038F¢\006\006\032\004\b\021\020\013¨\006\032"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "languageTag", "", "(Ljava/lang/String;)V", "platformLocale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "(Ljava/util/Locale;)V", "language", "getLanguage", "()Ljava/lang/String;", "getPlatformLocale", "()Ljava/util/Locale;", "region", "getRegion", "script", "getScript", "equals", "", "other", "hashCode", "", "toLanguageTag", "toString", "Companion", "ui-text"})
/*    */ @Immutable
/*    */ public final class Locale
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final java.util.Locale platformLocale;
/*    */   public static final int $stable;
/*    */   
/*    */   public Locale(@NotNull java.util.Locale platformLocale) {
/* 37 */     this.platformLocale = platformLocale; } @NotNull public final java.util.Locale getPlatformLocale() { return this.platformLocale; }
/*    */    @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\0048F¢\006\006\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "()V", "current", "Landroidx/compose/ui/text/intl/Locale;", "getCurrent", "()Landroidx/compose/ui/text/intl/Locale;", "ui-text"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/*    */     public final Locale getCurrent() {
/* 42 */       return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Locale(@NotNull String languageTag) {
/* 52 */     this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(languageTag));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getLanguage() {
/* 57 */     Intrinsics.checkNotNullExpressionValue(this.platformLocale.getLanguage(), "getLanguage(...)"); return this.platformLocale.getLanguage();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getScript() {
/* 62 */     Intrinsics.checkNotNullExpressionValue(this.platformLocale.getScript(), "getScript(...)"); return this.platformLocale.getScript();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getRegion() {
/* 67 */     return PlatformLocale_jvmKt.getRegion(this.platformLocale);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String toLanguageTag() {
/* 74 */     return PlatformLocale_jvmKt.getLanguageTag(this.platformLocale);
/*    */   }
/*    */   public boolean equals(@Nullable Object other) {
/* 77 */     if (other == null) return false; 
/* 78 */     if (!(other instanceof Locale)) return false; 
/* 79 */     if (this == other) return true; 
/* 80 */     return Intrinsics.areEqual(toLanguageTag(), ((Locale)other).toLanguageTag());
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 84 */     return toLanguageTag().hashCode(); } @NotNull
/*    */   public String toString() {
/* 86 */     return toLanguageTag();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\intl\Locale.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */