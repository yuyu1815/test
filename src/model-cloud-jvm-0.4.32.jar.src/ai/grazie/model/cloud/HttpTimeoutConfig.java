/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Duration;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0262\0020\001:\001\026B)\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\003¢\006\002\020\006J\013\020\013\032\004\030\0010\003HÆ\003J\013\020\f\032\004\030\0010\003HÆ\003J\013\020\r\032\004\030\0010\003HÆ\003J-\020\016\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0032\n\b\002\020\005\032\004\030\0010\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\007\020\bR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\t\020\bR\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\n\020\b¨\006\027"}, d2 = {"Lai/grazie/model/cloud/HttpTimeoutConfig;", "", "connectTimeout", "Lai/grazie/utils/mpp/time/Duration;", "requestTimeout", "socketTimeout", "(Lai/grazie/utils/mpp/time/Duration;Lai/grazie/utils/mpp/time/Duration;Lai/grazie/utils/mpp/time/Duration;)V", "getConnectTimeout", "()Lai/grazie/utils/mpp/time/Duration;", "getRequestTimeout", "getSocketTimeout", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "model-cloud"})
/*    */ public final class HttpTimeoutConfig
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @Nullable
/*    */   private final Duration connectTimeout;
/*    */   @Nullable
/*    */   private final Duration requestTimeout;
/*    */   @Nullable
/*    */   private final Duration socketTimeout;
/*    */   
/*    */   public HttpTimeoutConfig(@Nullable Duration connectTimeout, @Nullable Duration requestTimeout, @Nullable Duration socketTimeout) {
/* 93 */     this.connectTimeout = connectTimeout;
/* 94 */     this.requestTimeout = requestTimeout;
/* 95 */     this.socketTimeout = socketTimeout; } @Nullable public final Duration getConnectTimeout() { return this.connectTimeout; } @Nullable public final Duration getRequestTimeout() { return this.requestTimeout; } @Nullable public final Duration component1() { return this.connectTimeout; } @Nullable public final Duration component2() { return this.requestTimeout; } @Nullable public final Duration component3() { return this.socketTimeout; } @NotNull public final HttpTimeoutConfig copy(@Nullable Duration connectTimeout, @Nullable Duration requestTimeout, @Nullable Duration socketTimeout) { return new HttpTimeoutConfig(connectTimeout, requestTimeout, socketTimeout); } @Nullable public final Duration getSocketTimeout() { return this.socketTimeout; }
/*    */   @NotNull public String toString() { return "HttpTimeoutConfig(connectTimeout=" + this.connectTimeout + ", requestTimeout=" + this.requestTimeout + ", socketTimeout=" + this.socketTimeout + ")"; } public int hashCode() { result = (this.connectTimeout == null) ? 0 : this.connectTimeout.hashCode(); result = result * 31 + ((this.requestTimeout == null) ? 0 : this.requestTimeout.hashCode()); return result * 31 + ((this.socketTimeout == null) ? 0 : this.socketTimeout.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof HttpTimeoutConfig)) return false;  HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig)other; return !Intrinsics.areEqual(this.connectTimeout, httpTimeoutConfig.connectTimeout) ? false : (!Intrinsics.areEqual(this.requestTimeout, httpTimeoutConfig.requestTimeout) ? false : (!!Intrinsics.areEqual(this.socketTimeout, httpTimeoutConfig.socketTimeout))); } public HttpTimeoutConfig() { this(null, null, null, 7, null); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/model/cloud/HttpTimeoutConfig$Companion;", "", "()V", "of", "Lai/grazie/model/cloud/HttpTimeoutConfig;", "duration", "Lai/grazie/utils/mpp/time/Duration;", "model-cloud"}) public static final class Companion
/*    */   {
/* 98 */     @NotNull public final HttpTimeoutConfig of(@NotNull Duration duration) { Intrinsics.checkNotNullParameter(duration, "duration"); return new HttpTimeoutConfig(duration, duration, duration); }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\HttpTimeoutConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */