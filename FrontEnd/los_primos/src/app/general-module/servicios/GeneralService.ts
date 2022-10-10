import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Param } from '../clases/Params';
import { UrlUtils } from './url-utils.service';

@Injectable({
  providedIn: 'root',
})
export class GeneralService {
  constructor(protected html: HttpClient) { }

  getData<R>(
    baseUrl: string,
    params?: string | string[] | Param[],
    options?: {}
  ) {
    return this.html.get<R>(this.createUrl(baseUrl, params), options);
  }

  postData<R, B>(baseUrl: string, body?: B, options?: {}) {
    return this.html.post<R>(baseUrl, body, options);
  }

  putData<R, B>(
    baseUrl: string,
    params?: string | string[] | Param[],
    body?: B,
    options?: {}
  ) {
    return this.html.put<R>(this.createUrl(baseUrl, params), body, options);
  }

  patchData<R, B>(
    baseUrl: string,
    params?: string | string[] | Param[],
    body?: B,
    options?: {}
  ) {
    return this.html.patch<R>(this.createUrl(baseUrl, params), body, options);
  }

  deleteData<R>(
    baseUrl: string,
    params?: string | string[] | Param[],
    options?: {}
  ) {
    return this.html.delete<R>(this.createUrl(baseUrl, params), options);
  }

  createUrl(baseUrl: string, params?: string | string[] | Param[]): string {
    if (!params) return baseUrl;
    if (typeof params == 'string')
      return `${baseUrl}/${params}`;
    if (params instanceof Array && typeof params[0] == 'string')
      return `${baseUrl}/${params.join('/')}`;
    else return `${baseUrl}${UrlUtils.toQueryParams(params as Param[])}`;
  }
}