/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\b\b\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\003\032\022\020\013\032\0020\n*\0020\n2\006\020\f\032\0020\r\032\016\020\016\032\004\030\0010\n*\004\030\0010\n\032\n\020\017\032\0020\n*\0020\n\"\033\020\000\032\0020\0018BX\002¢\006\f\n\004\b\004\020\005\032\004\b\002\020\003\"\033\020\006\032\0020\0018BX\002¢\006\f\n\004\b\b\020\005\032\004\b\007\020\003\"\016\020\t\032\0020\nXT¢\006\002\n\000¨\006\020"}, d2 = {"LINE_BREAK_REGEX", "Lkotlin/text/Regex;", "getLINE_BREAK_REGEX", "()Lkotlin/text/Regex;", "LINE_BREAK_REGEX$delegate", "Lkotlin/Lazy;", "EXTRA_SPACES_REGEX", "getEXTRA_SPACES_REGEX", "EXTRA_SPACES_REGEX$delegate", "ELLIPSIS", "", "truncateWithEllipsis", "maxLength", "", "nullIfEmpty", "reformatToSingleLine", "ej-core"})
/*    */ public final class StringUtilKt { @NotNull
/*  3 */   private static final Lazy LINE_BREAK_REGEX$delegate = LazyKt.lazy(StringUtilKt::LINE_BREAK_REGEX_delegate$lambda$0); private static final Regex getLINE_BREAK_REGEX() { Lazy lazy = LINE_BREAK_REGEX$delegate; return (Regex)lazy.getValue(); } private static final Regex LINE_BREAK_REGEX_delegate$lambda$0() { return new Regex("\\r?\\n"); } @NotNull
/*  4 */   private static final Lazy EXTRA_SPACES_REGEX$delegate = LazyKt.lazy(StringUtilKt::EXTRA_SPACES_REGEX_delegate$lambda$1); @NotNull public static final String ELLIPSIS = "..."; private static final Regex getEXTRA_SPACES_REGEX() { Lazy lazy = EXTRA_SPACES_REGEX$delegate; return (Regex)lazy.getValue(); } private static final Regex EXTRA_SPACES_REGEX_delegate$lambda$1() { return new Regex("\\s+"); }
/*    */    @NotNull
/*    */   public static final String truncateWithEllipsis(@NotNull String $this$truncateWithEllipsis, int maxLength) {
/*  7 */     Intrinsics.checkNotNullParameter($this$truncateWithEllipsis, "<this>");
/*  8 */     return ((($this$truncateWithEllipsis.length() > maxLength) ? true : false) == true) ? (StringsKt.take($this$truncateWithEllipsis, maxLength) + "...") : 
/*  9 */       $this$truncateWithEllipsis;
/*    */   } @Nullable
/*    */   public static final String nullIfEmpty(@Nullable String $this$nullIfEmpty) {
/* 12 */     String str = $this$nullIfEmpty; return 
/* 13 */       (((str == null || str.length() == 0) ? true : false) == true) ? null : 
/* 14 */       $this$nullIfEmpty;
/*    */   } @NotNull
/*    */   public static final String reformatToSingleLine(@NotNull String $this$reformatToSingleLine) {
/* 17 */     Intrinsics.checkNotNullParameter($this$reformatToSingleLine, "<this>"); String str1 = $this$reformatToSingleLine; Regex regex = getLINE_BREAK_REGEX(); String str2 = " "; str1 = regex.replace(str1, str2); regex = getEXTRA_SPACES_REGEX(); str2 = " "; return StringsKt.trim(regex.replace(str1, str2)).toString();
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\StringUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */