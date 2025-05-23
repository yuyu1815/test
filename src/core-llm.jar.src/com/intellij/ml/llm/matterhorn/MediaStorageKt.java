/*   */ package com.intellij.ml.llm.matterhorn;
/*   */ import kotlin.jvm.internal.Intrinsics;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\022\n\002\030\002\n\000\n\002\020\016\n\000\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004¨\006\005"}, d2 = {"getOrThrow", "", "Lcom/intellij/ml/llm/matterhorn/MediaStorage;", "mediaContentId", "", "core"})
/*   */ public final class MediaStorageKt {
/*   */   @NotNull
/*   */   public static final byte[] getOrThrow(@NotNull MediaStorage $this$getOrThrow, @NotNull String mediaContentId) {
/* 9 */     Intrinsics.checkNotNullParameter($this$getOrThrow, "<this>"); Intrinsics.checkNotNullParameter(mediaContentId, "mediaContentId"); if ($this$getOrThrow.get(mediaContentId) == null) { $this$getOrThrow.get(mediaContentId); throw new IllegalStateException(("file with mediaContentId " + mediaContentId + " not found").toString()); }  return $this$getOrThrow.get(mediaContentId);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\MediaStorageKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */