/*    */ package androidx.compose.ui.text.intl;
/*    */ 
/*    */ import java.awt.ComponentOrientation;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\020\013\n\002\030\002\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000\032\020\020\002\032\0020\003*\0060\004j\002`\005H\000¨\006\006"}, d2 = {"createPlatformLocaleDelegate", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "isRtl", "", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "ui-text"})
/*    */ public final class DesktopPlatformLocale_desktopKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PlatformLocaleDelegate createPlatformLocaleDelegate() {
/* 22 */     return new DesktopPlatformLocale_desktopKt$createPlatformLocaleDelegate$1(); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\024\020\006\032\0060\007j\002`\b2\006\020\t\032\0020\nH\026R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\013"}, d2 = {"androidx/compose/ui/text/intl/DesktopPlatformLocale_desktopKt$createPlatformLocaleDelegate$1", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "current", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "parseLanguageTag", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "languageTag", "", "ui-text"})
/*    */   public static final class DesktopPlatformLocale_desktopKt$createPlatformLocaleDelegate$1 implements PlatformLocaleDelegate { @NotNull
/* 24 */     public LocaleList getCurrent() { Intrinsics.checkNotNullExpressionValue(Locale.getDefault(), "getDefault(...)"); return new LocaleList(CollectionsKt.listOf(new Locale(Locale.getDefault()))); }
/*    */     
/*    */     @NotNull
/*    */     public Locale parseLanguageTag(@NotNull String languageTag) {
/* 28 */       Intrinsics.checkNotNullParameter(languageTag, "languageTag"); Intrinsics.checkNotNullExpressionValue(Locale.forLanguageTag(languageTag), "forLanguageTag(...)"); return Locale.forLanguageTag(languageTag);
/*    */     } }
/*    */ 
/*    */ 
/*    */   
/*    */   public static final boolean isRtl(@NotNull Locale $this$isRtl) {
/* 34 */     Intrinsics.checkNotNullParameter($this$isRtl, "<this>"); return !ComponentOrientation.getOrientation($this$isRtl).isLeftToRight();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\intl\DesktopPlatformLocale_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */