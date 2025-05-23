/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\026\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\b"}, d2 = {"jarPathRegex", "Lkotlin/text/Regex;", "relativeUriString", "", "root", "Ljava/net/URI;", "path", "Ljava/nio/file/Path;", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class PathKt {
/*    */   @NotNull
/*  6 */   private static final Regex jarPathRegex = new Regex("/.*(/.*\\.jar)!/(.*)");
/*    */   @NotNull
/*    */   public static final String relativeUriString(@NotNull URI root, @NotNull Path path) {
/*  9 */     Intrinsics.checkNotNullParameter(root, "root"); Intrinsics.checkNotNullParameter(path, "path"); URI pathUri = path.toUri();
/* 10 */     Intrinsics.checkNotNullExpressionValue(root.getScheme(), "getScheme(...)"); Intrinsics.checkNotNullExpressionValue(root.getScheme().toLowerCase(Locale.ROOT), "toLowerCase(...)"); Intrinsics.checkNotNullExpressionValue(pathUri.getScheme(), "getScheme(...)"); Intrinsics.checkNotNullExpressionValue(pathUri.getScheme().toLowerCase(Locale.ROOT), "toLowerCase(...)"); if (!Intrinsics.areEqual(root.getScheme().toLowerCase(Locale.ROOT), pathUri.getScheme().toLowerCase(Locale.ROOT))) return path.toString();
/*    */ 
/*    */     
/* 13 */     Intrinsics.checkNotNullExpressionValue(root.getScheme(), "getScheme(...)"); Intrinsics.checkNotNullExpressionValue(root.getScheme().toLowerCase(Locale.ROOT), "toLowerCase(...)"); if (Intrinsics.areEqual(root.getScheme().toLowerCase(Locale.ROOT), "jar")) {
/* 14 */       String rootTail, pathTail; Intrinsics.checkNotNullExpressionValue(root.getRawSchemeSpecificPart(), "getRawSchemeSpecificPart(...)"); MatchResult rootMatch = Regex.find$default(jarPathRegex, root.getRawSchemeSpecificPart(), 0, 2, null);
/* 15 */       Intrinsics.checkNotNullExpressionValue(pathUri.getRawSchemeSpecificPart(), "getRawSchemeSpecificPart(...)"); MatchResult pathMatch = Regex.find$default(jarPathRegex, pathUri.getRawSchemeSpecificPart(), 0, 2, null);
/* 16 */       rootMatch.getGroups().get(1); pathMatch.getGroups().get(1); if (!Intrinsics.areEqual((rootMatch != null && rootMatch.getGroups() != null && rootMatch.getGroups().get(1) != null) ? rootMatch.getGroups().get(1).getValue() : null, (pathMatch != null && pathMatch.getGroups() != null && pathMatch.getGroups().get(1) != null) ? pathMatch.getGroups().get(1).getValue() : null)) {
/* 17 */         return path.toString();
/*    */       }
/* 19 */       if (rootMatch == null || rootMatch.getGroups() == null || rootMatch.getGroups().get(2) == null || rootMatch.getGroups().get(2).getValue() == null) { rootMatch.getGroups().get(2).getValue(); return path.toString(); }
/* 20 */        if (pathMatch == null || pathMatch.getGroups() == null || pathMatch.getGroups().get(2) == null || pathMatch.getGroups().get(2).getValue() == null) { pathMatch.getGroups().get(2).getValue(); return path.toString(); }
/* 21 */        return StringsKt.removePrefix(pathTail, rootTail);
/*    */     } 
/* 23 */     Intrinsics.checkNotNullExpressionValue(root.relativize(pathUri).toString(), "toString(...)"); return root.relativize(pathUri).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\PathKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */