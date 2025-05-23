/*   */ package com.intellij.ml.llm.matterhorn.utils;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\032\032\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005\032\022\020\006\032\0020\001*\0020\0012\006\020\002\032\0020\003¨\006\007"}, d2 = {"with", "Lkotlinx/serialization/json/JsonObject;", "key", "", "value", "Lkotlinx/serialization/json/JsonElement;", "without", "core"})
/*   */ public final class JsonUtilsKt {
/*   */   @NotNull
/* 7 */   public static final JsonObject with(@NotNull JsonObject $this$with, @NotNull String key, @NotNull JsonElement value) { Intrinsics.checkNotNullParameter($this$with, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); return new JsonObject(MapsKt.plus((Map)$this$with, new Pair(key, value))); } @NotNull
/*   */   public static final JsonObject without(@NotNull JsonObject $this$without, @NotNull String key) {
/* 9 */     Intrinsics.checkNotNullParameter($this$without, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); return new JsonObject(MapsKt.minus((Map)$this$without, key));
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhor\\utils\JsonUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */