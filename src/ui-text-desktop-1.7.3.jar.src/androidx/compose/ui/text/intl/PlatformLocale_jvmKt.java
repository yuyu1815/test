/*    */ package androidx.compose.ui.text.intl;
/*    */ 
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\t\032\020\020\n\032\0020\001*\0060\002j\002`\003H\000\"\034\020\000\032\0020\001*\0060\002j\002`\0038@X\004¢\006\006\032\004\b\004\020\005\"\034\020\006\032\0020\001*\0060\002j\002`\0038@X\004¢\006\006\032\004\b\007\020\005\"\034\020\b\032\0020\001*\0060\002j\002`\0038@X\004¢\006\006\032\004\b\t\020\005*\n\020\013\"\0020\0022\0020\002¨\006\f"}, d2 = {"language", "", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "getLanguage", "(Ljava/util/Locale;)Ljava/lang/String;", "region", "getRegion", "script", "getScript", "getLanguageTag", "PlatformLocale", "ui-text"})
/*    */ public final class PlatformLocale_jvmKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String getLanguage(@NotNull Locale $this$language) {
/* 24 */     Intrinsics.checkNotNullParameter($this$language, "<this>"); Intrinsics.checkNotNullExpressionValue($this$language.getLanguage(), "getLanguage(...)"); return $this$language.getLanguage();
/*    */   } @NotNull
/*    */   public static final String getScript(@NotNull Locale $this$script) {
/* 27 */     Intrinsics.checkNotNullParameter($this$script, "<this>"); Intrinsics.checkNotNullExpressionValue($this$script.getScript(), "getScript(...)"); return $this$script.getScript();
/*    */   }
/*    */   @NotNull
/* 30 */   public static final String getRegion(@NotNull Locale $this$region) { Intrinsics.checkNotNullParameter($this$region, "<this>"); Intrinsics.checkNotNullExpressionValue($this$region.getCountry(), "getCountry(...)"); return $this$region.getCountry(); } @NotNull
/*    */   public static final String getLanguageTag(@NotNull Locale $this$getLanguageTag) {
/* 32 */     Intrinsics.checkNotNullParameter($this$getLanguageTag, "<this>"); Intrinsics.checkNotNullExpressionValue($this$getLanguageTag.toLanguageTag(), "toLanguageTag(...)"); return $this$getLanguageTag.toLanguageTag();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\intl\PlatformLocale_jvmKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */