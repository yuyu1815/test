/*     */ package ai.grazie.model.llm.utils;
/*     */ import ai.grazie.model.llm.profile.LLMProfile;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.provider.LLMServiceProvider;
/*     */ import java.util.Collection;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\020\013\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002\032\030\020\003\032\b\022\004\022\0020\0020\004*\0020\0052\006\020\006\032\0020\007\032\f\020\b\032\004\030\0010\t*\0020\n¨\006\013"}, d2 = {"checkIfExperimental", "", "Lai/grazie/model/llm/profile/LLMProfile;", "getSupportedProfiles", "", "Lai/grazie/model/llm/provider/LLMServiceProvider;", "accessLevel", "Lai/grazie/model/llm/utils/LLMProfilesAccessLevel;", "toName", "", "Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*     */ @SourceDebugExtension({"SMAP\nprofiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 profiles.kt\nai/grazie/model/llm/utils/ProfilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n774#2:106\n865#2,2:107\n774#2:109\n865#2,2:110\n*S KotlinDebug\n*F\n+ 1 profiles.kt\nai/grazie/model/llm/utils/ProfilesKt\n*L\n21#1:106\n21#1:107,2\n22#1:109\n22#1:110,2\n*E\n"})
/*     */ public final class ProfilesKt {
/*     */   @NotNull
/*     */   public static final List<LLMProfile> getSupportedProfiles(@NotNull LLMServiceProvider $this$getSupportedProfiles, @NotNull LLMProfilesAccessLevel accessLevel) {
/*     */     Iterable $this$filter$iv;
/*     */     int $i$f$filter;
/*     */     Iterable iterable1, $this$filterTo$iv$iv;
/*     */     Collection<Object> collection1, destination$iv$iv;
/*     */     int $i$f$filterTo;
/*  19 */     Intrinsics.checkNotNullParameter($this$getSupportedProfiles, "<this>"); Intrinsics.checkNotNullParameter(accessLevel, "accessLevel"); switch (WhenMappings.$EnumSwitchMapping$0[accessLevel.ordinal()]) { case 1: 
/*     */       case 2:
/*  21 */         $this$filter$iv = $this$getSupportedProfiles.getProfiles(); $i$f$filter = 0;
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
/* 106 */         iterable1 = $this$filter$iv; collection1 = new ArrayList(); $i$f$filterTo = 0;
/* 107 */         for (Object element$iv$iv : iterable1) { LLMProfile it = (LLMProfile)element$iv$iv; int $i$a$-filter-ProfilesKt$getSupportedProfiles$1 = 0; if (!(it instanceof ai.grazie.model.llm.marker.DevMarker)) collection1.add(element$iv$iv);  } 
/*     */       case 3:
/* 109 */         $this$filter$iv = $this$getSupportedProfiles.getProfiles(); $i$f$filter = 0; $this$filterTo$iv$iv = $this$filter$iv; destination$iv$iv = new ArrayList(); $i$f$filterTo = 0;
/* 110 */         for (Object element$iv$iv : $this$filterTo$iv$iv) { LLMProfile it = (LLMProfile)element$iv$iv; int $i$a$-filter-ProfilesKt$getSupportedProfiles$2 = 0; if ((!(it instanceof ai.grazie.model.llm.marker.ExperimentalMarker) && !(it instanceof ai.grazie.model.llm.marker.DevMarker))) destination$iv$iv.add(element$iv$iv);  }
/*     */        }
/*     */     
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   public static final boolean checkIfExperimental(@NotNull LLMProfile $this$checkIfExperimental) {
/*     */     Intrinsics.checkNotNullParameter($this$checkIfExperimental, "<this>");
/*     */     return ($this$checkIfExperimental instanceof ai.grazie.model.llm.marker.DevMarker || $this$checkIfExperimental instanceof ai.grazie.model.llm.marker.ExperimentalMarker);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final String toName(@NotNull LLMProfileID $this$toName) {
/*     */     Intrinsics.checkNotNullParameter($this$toName, "<this>");
/*     */     return ProfileNames.INSTANCE.getProfileIDtoName().get($this$toName);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\ll\\utils\ProfilesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */