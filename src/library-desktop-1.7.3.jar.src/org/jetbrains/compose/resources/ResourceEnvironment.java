/*    */ package org.jetbrains.compose.resources;@ExperimentalResourceApi
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\b\007\030\0002\0020\001B'\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001H\002J\b\020\026\032\0020\027H\026R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\021\020\022¨\006\030"}, d2 = {"Lorg/jetbrains/compose/resources/ResourceEnvironment;", "", "language", "Lorg/jetbrains/compose/resources/LanguageQualifier;", "region", "Lorg/jetbrains/compose/resources/RegionQualifier;", "theme", "Lorg/jetbrains/compose/resources/ThemeQualifier;", "density", "Lorg/jetbrains/compose/resources/DensityQualifier;", "(Lorg/jetbrains/compose/resources/LanguageQualifier;Lorg/jetbrains/compose/resources/RegionQualifier;Lorg/jetbrains/compose/resources/ThemeQualifier;Lorg/jetbrains/compose/resources/DensityQualifier;)V", "getDensity$library", "()Lorg/jetbrains/compose/resources/DensityQualifier;", "getLanguage$library", "()Lorg/jetbrains/compose/resources/LanguageQualifier;", "getRegion$library", "()Lorg/jetbrains/compose/resources/RegionQualifier;", "getTheme$library", "()Lorg/jetbrains/compose/resources/ThemeQualifier;", "equals", "", "other", "hashCode", "", "library"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class ResourceEnvironment { @NotNull
/*    */   private final LanguageQualifier language; @NotNull
/*    */   private final RegionQualifier region; @NotNull
/*    */   private final ThemeQualifier theme; @NotNull
/*    */   private final DensityQualifier density; public static final int $stable;
/*    */   
/* 10 */   public ResourceEnvironment(@NotNull LanguageQualifier language, @NotNull RegionQualifier region, @NotNull ThemeQualifier theme, @NotNull DensityQualifier density) { this.language = language;
/* 11 */     this.region = region;
/* 12 */     this.theme = theme;
/* 13 */     this.density = density; } @NotNull public final LanguageQualifier getLanguage$library() { return this.language; } @NotNull public final DensityQualifier getDensity$library() { return this.density; }
/*    */   @NotNull public final RegionQualifier getRegion$library() { return this.region; }
/*    */   @NotNull
/* 16 */   public final ThemeQualifier getTheme$library() { return this.theme; } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 17 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 19 */     (ResourceEnvironment)other;
/*    */     
/* 21 */     if (!Intrinsics.areEqual(this.language, ((ResourceEnvironment)other).language)) return false; 
/* 22 */     if (!Intrinsics.areEqual(this.region, ((ResourceEnvironment)other).region)) return false; 
/* 23 */     if (this.theme != ((ResourceEnvironment)other).theme) return false; 
/* 24 */     if (this.density != ((ResourceEnvironment)other).density) return false;
/*    */     
/* 26 */     return true; }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 30 */     int result = this.language.hashCode();
/* 31 */     result = 31 * result + this.region.hashCode();
/* 32 */     result = 31 * result + this.theme.hashCode();
/* 33 */     result = 31 * result + this.density.hashCode();
/* 34 */     return result;
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ResourceEnvironment.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */